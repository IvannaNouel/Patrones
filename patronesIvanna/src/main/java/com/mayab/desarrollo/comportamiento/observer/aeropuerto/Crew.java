package com.mayab.desarrollo.comportamiento.observer.aeropuerto;

public class Crew implements Observer{

	@Override
	public void update(String fromto, String hora, String status, String dia, int puerta) {
		System.out.println("Aviso para el empleado del vuelo");
		
	}


}
