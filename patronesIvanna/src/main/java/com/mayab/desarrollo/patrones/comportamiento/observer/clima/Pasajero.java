package com.mayab.desarrollo.patrones.comportamiento.observer.clima;

import java.util.Observable;
import java.util.Observer;

public class Pasajero implements Observer {

	@Override
	public void update(Observable o, Object arg) {
	Vuelo vuelo = (Vuelo) o;
	
	System.out.println("Mi vuelo cambio: "+ vuelo.getDia()+""+ vuelo.getFromto()+""+vuelo.getSala());
	}

}
