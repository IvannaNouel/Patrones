package com.mayab.desarrollo.patrones.comportamiento.strategy;
import java.util.ArrayList;


public abstract class Reporte {
	
		ExportBehavior eb;
		ArrayList<Articulo> ListArticulos;
	
	public Reporte() {
		
		ListArticulos = new ArrayList<Articulo>();
	}
	
	public void setExportBehavior(ExportBehavior eb){
		
		this.eb = eb;
		
	}
	
	public void agregarArticulo(Articulo articulo ) {
		
		ListArticulos.add(articulo);
	}
	
	public void performExport() {
		
		eb.Exportar();
		for(Articulo articulo : ListArticulos) {
			System.out.println(articulo.nombre);
		}
		
	}
}
