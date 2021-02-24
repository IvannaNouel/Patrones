package com.mayab.desarrollo.parcial1.problema1;

public class DriverObserver {

	public static void main(String[] args) {
		
		//exceso 1000 
		
	    Subject SAGE = new Empresa();
	    Observer customer1 = new ClienteNormal();
	    Observer customer2 = new ExcesoGasto();
	    Observer customer3 = new ExcesoGasto();

	    SAGE.registerObserver(customer1);
	    SAGE.registerObserver(customer2);

	    SAGE.notifyObservers();

	    
	}
	
}
