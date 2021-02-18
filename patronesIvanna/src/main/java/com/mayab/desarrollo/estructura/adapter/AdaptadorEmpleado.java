package com.mayab.desarrollo.estructura.adapter;

public class AdaptadorEmpleado implements PersonaNueva{
	
	PersonaVieja personaVieja;
	
	public AdaptadorEmpleado(PersonaVieja personaVieja) {
		this.personaVieja = personaVieja;
	}

	@Override
	public String getNombre(){
		String nombre = personaVieja.getNombre();
		String apellido = personaVieja.getApellido();
		return nombre + " " + apellido;
	}

	@Override
	public int getEdad() {
		return 2021 - personaVieja.getFechaNacimiento();
	}
}
