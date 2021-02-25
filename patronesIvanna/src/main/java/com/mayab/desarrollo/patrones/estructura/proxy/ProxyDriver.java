package com.mayab.desarrollo.patrones.estructura.proxy;


public class ProxyDriver {
	
	public static void main(String[] args) {
		
		
	Empleado e1 = new Empleado("Administrator");
	Empleado e2 = new Empleado("Seller");
	
	Reporte r1 = new ReporteVentasProxy(e1);
	Reporte r2 = new ReporteVentasProxy(e2);

	System.out.println("----Administrator----");
	System.out.println("Only Administrators can write");
	r1.write("Only Administrators can write");
	r1.read();
	
	System.out.println("----Seller----");
	System.out.println("'Sellers only have permission to read'");
	r1.read();
	
	}
}
