package com.mayab.desarrollo.patrones.comportamiento.strategy;

public class ReporteMes extends Reporte{
	
	public ReporteMes() {
		
		eb = new ExportXML();
	}
}
