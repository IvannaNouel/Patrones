package com.mayab.desarrollo.patrones.comportamiento.strategy;


public class StrategyDriver {

	public static void main(String[] args) {
		
		Articulo art1 = new Articulo("Blusa", 5);
		Articulo art2  = new Articulo("Pantalones Jeans", 1);
		Articulo art3  = new Articulo("Falda", 2);
		
		
		System.out.println("----Reporte 1----");
		Reporte reporte1 = new ReporteVentas();
		reporte1.agregarArticulo( art1 );
		reporte1.agregarArticulo( art2);
		reporte1.performExport();
		reporte1.setExportBehavior(new ExportPDF());
		reporte1.performExport();
		
		
		System.out.println("----Reporte 2----");
		Reporte reporte2 = new ReporteMes();
		reporte2.agregarArticulo( art3);
		reporte2.agregarArticulo( art1);
		reporte2.performExport();
		reporte2.setExportBehavior(new ExportPDF());
		reporte2.performExport();
		
		
	}

}
