package com.mayab.desarrollo.patrones.comportamiento.observer.clima;

import com.mayab.desarrollo.comportamiento.observer.aeropuerto.DisplayElement;
import com.mayab.desarrollo.comportamiento.observer.aeropuerto.Observer;
import com.mayab.desarrollo.comportamiento.observer.aeropuerto.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
