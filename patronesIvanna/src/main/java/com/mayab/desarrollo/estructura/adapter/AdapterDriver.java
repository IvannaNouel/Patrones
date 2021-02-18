package com.mayab.desarrollo.estructura.adapter;

import java.util.ArrayList;

public class AdapterDriver {

	public static void main(String[] args) {

	PersonaVieja OldEmpleado = new EmpleadoViejo("Melissa","Puerto", 2000);
	AdaptadorEmpleado adaptador = new AdaptadorEmpleado(OldEmpleado);
	PersonaNueva NewEmpleado = new EmpleadoNuevo("Veronica Millan", 21);
	
	ArrayList<PersonaNueva> ListaEmpleados = new ArrayList<PersonaNueva>();
		
	ListaEmpleados.add(NewEmpleado);
	ListaEmpleados.add(adaptador);
		
	for(PersonaNueva persona : ListaEmpleados) {
	System.out.println("Nombre: " + persona.getNombre());
	System.out.println("Edad:" + persona.getEdad());
	System.out.println("------------");

		}

	}

}
