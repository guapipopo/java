package FriedChicken;

import java.time.LocalDate;


 abstract class Drinks{
	protected String name;
	protected double cost;
	protected LocalDate date;
	protected int day;
	
	public Drinks() {
		
	}
	
	public Drinks(String name,double cost,LocalDate date) {
	this.name=name;
	this.cost=cost;
	this.date=date;
	}
	
    public abstract String toString();
    public boolean overdue() {
//    date.minusDays(day);
//    LocalDate.now();
    	
    	if(this instanceof Beer) {
    	Beer beer=(Beer)this;
    	if( date.minusDays(beer.day).isAfter( LocalDate.now())) {
        	return false;
        }else return true;
    	
    	}else {
    		Juice juice=(Juice)this;
    		if( date.minusDays(juice.day).isAfter( LocalDate.now())) {
    	    	return false;
    	    }else return true;
    	}
    
    	
    }
    
}
