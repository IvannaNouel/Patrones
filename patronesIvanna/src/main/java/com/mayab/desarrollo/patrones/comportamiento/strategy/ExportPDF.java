package com.mayab.desarrollo.patrones.comportamiento.strategy;

public class ExportPDF implements ExportBehavior {

	@Override
	public void Exportar() {
			System.out.println("Exportando en PDF: ");
	}

}
