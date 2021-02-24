package com.mayab.desarrollo.comportamiento.observer.aeropuerto;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
