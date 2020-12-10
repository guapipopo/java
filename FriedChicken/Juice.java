package FriedChicken;

import java.time.LocalDate;

public class Juice extends Drinks{
	
		 public int day=2;
			public Juice(String name,double cost,LocalDate date) {
				super(name,cost,date);
 }
			public String toString(){
				return this.name;
			}
	
}