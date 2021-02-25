package com.mayab.desarrollo.patrones.estructura.proxy;

import java.io.File;

public class ReporteVentasProxy implements Reporte {
	
	Empleado e;
	ReporteVentas reporteVentas;
	
	public ReporteVentasProxy(Empleado e) {
		this.e = e;
		reporteVentas = new ReporteVentas();
	}
	
	@Override
	public void read() {
		reporteVentas.read();
	}

	@Override
	public void write(String s) {
		if(e.getTipo() == "Administrator") {
			
		} else {
			reporteVentas.write(s);
		}

	}

}
