package com.mayab.desarrollo.comportamiento.observer.aeropuerto;

public interface Observer {
	public void update(String fromto, String hora, String status, String dia, int puerta);
}
