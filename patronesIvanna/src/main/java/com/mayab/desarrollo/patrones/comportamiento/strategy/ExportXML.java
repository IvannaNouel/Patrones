package com.mayab.desarrollo.patrones.comportamiento.strategy;

public class ExportXML implements ExportBehavior {
	
	@Override
	public void Exportar() {
		System.out.println("Exportando en XML: ");
	}

}
