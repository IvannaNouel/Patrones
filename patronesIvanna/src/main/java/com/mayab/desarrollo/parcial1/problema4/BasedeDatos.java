package com.mayab.desarrollo.parcial1.problema4;

public abstract class BasedeDatos {

	public final void guardar() {
		
		abrirCon();
		String s = generarSentencia();
		ejecutarSentencia(s);
	
	}

	public abstract String generarSentencia(); 
	
	final void abrirCon() {
		System.out.println("Abriendo Conexion");
	
	}
		
	final void ejecutarSentencia(String sentencia) {
		System.out.println("Ejecutando Sentencia: " + sentencia);
		
	}
	
}
