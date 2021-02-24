package com.mayab.desarrollo.comportamiento.observer.aeropuerto;

import java.util.Observable;

public class Vuelo extends Observable{
	
	
	private String fromto;
	private String hora;
	private String sala;
	private String dia;
	
	public Vuelo(String f, String h, String s, String d) {
		fromto= f;
		hora = h;
		sala = s;
		dia = d;
		
	}

	public String getFromto() {
		return fromto;
	}

	public String getHora() {
		return hora;
	}

	public String getSala() {
		return sala;
	}

	public String getDia() {
		return dia;
	}

	
	public void setFromto(String fromto) {
		this.fromto = fromto;
		setChanged();
		notifyObservers();
	
	}
	public void setHora(String hora) {
		this.hora = hora;
		setChanged();
		notifyObservers();
	}

	public void setSala(String sala) {
		this.sala = sala;
		setChanged();
		notifyObservers();
	}
	
	public void setDia(String dia) {
		this.dia = dia;
		setChanged();
		notifyObservers();
	}
	
	
	

}
