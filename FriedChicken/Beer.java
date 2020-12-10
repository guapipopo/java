package FriedChicken;

import java.time.LocalDate;

 class Beer extends Drinks{
	public float alcohol;
	public int day;
	
	public Beer() {		
	}
	
	public Beer(String name,double cost,LocalDate date,float alcohol) {
		this.name=name;
		this.cost=cost;
		this.date=date;		
		this.alcohol=alcohol;
		this.day=30;
	}
	
	public String toString() {
		return this.name;
	}
}
	
 