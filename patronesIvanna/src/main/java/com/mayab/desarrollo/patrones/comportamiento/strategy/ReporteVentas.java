package com.mayab.desarrollo.patrones.comportamiento.strategy;

public class ReporteVentas extends Reporte {
	
	public ReporteVentas() {
		
		eb = new ExportJson();
	}
}
