package com.mayab.desarrollo.parcial1.problema1;

public class ExcesoGasto implements Observer{
	@Override
    public void update(String message) {
        processMessage(message);
    }
    private void processMessage(String message) {
    	
    	if(gasto(1000) > 100) {
        System.out.println("Se esta excediendo de su limite");
    	}
    }
	@Override
	public double gasto(double gasto) {
		
		return 100;
	}

}
