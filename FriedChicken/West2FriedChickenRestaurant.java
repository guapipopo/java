package FriedChicken;

import java.util.ArrayList;

import java.time.LocalDate;

public class West2FriedChickenRestaurant implements FriedChickenRestaurant{

	double balance;	
	
	public static  SetMeal st1;
	public static  SetMeal st2;
	
   
	ArrayList<Beer> beerlist=new ArrayList<Beer>();
	ArrayList<Juice> juicelist=new ArrayList<Juice>();
	static ArrayList<SetMeal> suitlist=new ArrayList<SetMeal>();

	public void sell(SetMeal sm) {
		balance=balance+sm.price;
		if(sm.setmealdrink instanceof Beer) {
	try{	
		use((Beer)sm.setmealdrink);	
	}catch(IngredientSortOutException e) {
		balance=balance-sm.price;
		
		System.out.println(e.getMessage());
	}
		}
		else if(sm.setmealdrink instanceof Juice) {
	try{
		use((Juice)sm.setmealdrink);	
	}catch(IngredientSortOutException e) {
	balance=balance-sm.price;
	System.out.println(e.getMessage());
	}
		}
		
	}
	
	public void buy(Drinks drink,int num) {
		if(drink instanceof Beer) {
			Beer beer=(Beer) drink;
			if(balance-num*beer.cost>0) {
				beerlist.add(beer);
				System.out.println("雪花啤酒进货成功"+num);
			}else if(balance-num*beer.cost<0){
           throw new OverdraftBalanceException("雪花啤酒进货失败，还差"+(num*beer.cost-balance));
			}
		}
		
		if(drink instanceof Juice) {
			Juice juice=(Juice) drink;
			if(balance-num*juice.cost>0) {
				juicelist.add(juice);
				System.out.println("苹果汁进货成功"+num);
			}else if(balance-num*juice.cost<0){
           throw new OverdraftBalanceException("苹果汁进货失败，还差"+(num*juice.cost-balance));
			}
	}
}
	private void use(Beer beer)throws IngredientSortOutException{		
		boolean sign=true;
		

		
		for(Beer beer1:beerlist) {
			
			 if(beer.name==beer1.name) {
				beerlist.remove(beer1);
				System.out.println(beer.name+"出售成功");
				sign=false;
				break;
				}
		}
			if(sign) {
				throw new IngredientSortOutException(beer.name+"啤酒已售空");
			}
		}
		
	
	
	private void use(Juice juice) throws  IngredientSortOutException{
		boolean sign=true;
			
		for(Juice juice1:juicelist) {
			
			if(juice.name==juice1.name) {
				beerlist.remove(juice1);
				System.out.println(juice.name+"出售成功");
				sign=false;
				break;
				
			}
			
		}
		if (sign) {
			throw new IngredientSortOutException(juice.name+"已售空");
		}
	}
	static { 
		LocalDate beerstart=LocalDate.of(2020,11,11);
		LocalDate juicestart=LocalDate.of(2020,12,1);
		Drinks xuehua=new Beer("雪花啤酒",299.5,beerstart,50f);
	    Drinks pingguo=new Juice("苹果汁",15.5,juicestart);
		st1=new SetMeal("one",30.5,"yansuji",xuehua);
		st2=new SetMeal("two",30.5,"jiaohuaji",pingguo);
		suitlist.add(st1);
		suitlist.add(st2);
		
	}
}


