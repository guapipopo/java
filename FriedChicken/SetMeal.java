package FriedChicken;



public class SetMeal {
 String setname;
 double price;
 String chickenname;
 Drinks setmealdrink;

 public SetMeal(String setname,double price,String chickenname,Drinks setmealdrink) {
	 this.setname=setname;
	 this.price=price;
	 this.chickenname=chickenname;
	 this.setmealdrink=setmealdrink;
 }
 
 @Override
public String toString() {
	return "SetMeal [setname=" + setname + ", price=" + price + ", chickenname=" + chickenname + ", setmealdrink="
			+ setmealdrink + "]";
}


 
 
 
 

}
