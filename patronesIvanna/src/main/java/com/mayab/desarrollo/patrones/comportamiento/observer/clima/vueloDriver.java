package com.mayab.desarrollo.patrones.comportamiento.observer.clima;

public class vueloDriver {

	public static void main(String[] args) {
		//String f, String h, String s, String d)
		Vuelo v = new Vuelo(" SDQ-MIA ", " 12:00 "," 25 "," 16-feb-2021 ");
		
		Pasajero p = new Pasajero();
		
		v.addObserver(p);
		
		v.setFromto(" GDL-MID ");
		
		
	}

}
