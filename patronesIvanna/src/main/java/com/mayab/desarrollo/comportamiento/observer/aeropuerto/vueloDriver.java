package com.mayab.desarrollo.comportamiento.observer.aeropuerto;

public class vueloDriver {

	public static void main(String[] args) {
		//String f, String h, String s, String d)
		Vuelo v = new Vuelo(" SDQ-MIA ", " 12:00 "," 25 "," 16-feb-2021 ");
		DisplayElement DE = null;
		
		Pasajero p = new Pasajero();
		
		v.addObserver(p);
		
		v.setFromto(" GDL-MID ");
		
		

		
	}

}
