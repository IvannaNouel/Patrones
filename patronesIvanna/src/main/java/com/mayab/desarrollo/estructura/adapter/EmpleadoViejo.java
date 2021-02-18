package com.mayab.desarrollo.estructura.adapter;

import java.time.LocalDate;

public class EmpleadoViejo implements PersonaVieja {
	String nombre;
	String apellido;
	int FechaNacimiento;
	
	public EmpleadoViejo(String n, String a, int f) {
		this.nombre = n;
		this.apellido = a;
		this.FechaNacimiento = f;
	}
	

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String getApellido() {
		return this.apellido;
	}

	@Override
	public int getFechaNacimiento() {
		return this.FechaNacimiento;
	}
	
	
}
