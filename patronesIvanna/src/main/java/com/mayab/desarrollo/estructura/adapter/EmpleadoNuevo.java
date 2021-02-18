package com.mayab.desarrollo.estructura.adapter;

public class EmpleadoNuevo implements PersonaNueva {

	String nombre;
	int edad;
	
	public EmpleadoNuevo(String n, int e) {
		this.nombre = n;
		this.edad = e;
	}
	
	@Override
	public String getNombre(){
		return nombre;
	}

	@Override
	public int getEdad() {
		return edad;
	}

}
