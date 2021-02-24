package com.mayab.desarrollo.parcial1.problema3;

public abstract class ProductosDeGas {
	/*
	 1. Registrar los parámetros iniciales del lote.
	 2. Registrar los parámetros finales. 
	 3. Calcular el volumen de gas envasado
	 4. Realizar las inspecciones de seguridad del lote. 
	 5. Imprimir el reporte de llenado.
	 */
	
	public final void guardar() {
		

		RegistrarIniciales();
		RegistrarFinal();
		CalcularVolumen();
		InspeccionSeguridad();
		ImprimirReporte();
	
	}

	public abstract void RegistrarIniciales(); 
	public abstract void RegistrarFinal(); 
	public abstract void CalcularVolumen(); 
	public abstract void InspeccionSeguridad(); 

	
	final void ImprimirReporte() {
		System.out.println("Imprimiendo reporte con fecha, la cantidad envasada, el consumo de materia prima "
				+ "y espacios para las firmas de los operadores e inspectores.\n");
	
	}
	
	
}
