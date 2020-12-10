package FriedChicken;

import java.time.LocalDate;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		West2FriedChickenRestaurant r1=new West2FriedChickenRestaurant();
		r1.balance=1000;
		LocalDate beerstart=LocalDate.of(2020,12,10);
		LocalDate juicestart=LocalDate.of(2020,11,9);

		Drinks xuehua=new Beer("Ñ©»¨Æ¡¾Æ",299.5,beerstart,50f);
	    Drinks pingguo=new Juice("Æ»¹ûÖ­",15.5,juicestart);
	   
		r1.buy(xuehua,1);
		r1.buy(pingguo, 3);
		r1.sell(r1.st1);
		r1.sell(r1.st1);
		r1.sell(r1.st2);
		r1.sell(r1.st2);

		}

}
