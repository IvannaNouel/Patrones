package com.mayab.desarrollo.parcial1.problema1;

import java.util.ArrayList;

public class Empresa implements Subject {
			
		ExcesoGasto eg = new ExcesoGasto();
		ClienteNormal cl = new ClienteNormal();

	
	   private ArrayList<Observer> customers = new ArrayList<>();

	    @Override
	    public void registerObserver(Observer customer) {
	        customers.add(customer);
	    }
	    @Override
	    public void removeObserver(Observer customer) {
	        customers.remove(customer);
	    }
	    @Override
	    public void notifyObservers() {
	    		
	    	if(eg.gasto(1000) > 100) 
	    	{
	    		System.out.println("Excedio el limite");
	    		System.out.println("Enviado por correo Electronica a las 3:00pm");
		        for(Observer customer: customers) {
		        customer.update("Enviado por correo Electronica a las 3:00pm");
		        }
	    	}
	    	else {
	    		System.out.println("Felices compras");
	    		System.out.println("Enviado por mensaje de texto a las 4:00pm");
		        for(Observer customer: customers) {
		        customer.update("Enviado por mensaje de texto a las 4:00pm");

	    	}
		       
	   }
	}

}
