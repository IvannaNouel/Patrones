package com.mayab.desarrollo.parcial1.problema2;

public class DriverDecorator {

	public static void main(String[] args) {
		
		//El precio del producto que utilice fue 100
			
		Calculadora calculadora = new CalculadoraDeImpuestos();
		
		System.out.println("-----Producto 16% local------");
		
		Calculadora calculadora1 = new ImpuestoBaseDecorator(calculadora);
		System.out.println(calculadora1.calcularPrecio(100));
		
		System.out.println("-----Producto 8% fronterizo------");
		
		Calculadora calculadora2 = new CiudadFronterizaDecorator(calculadora);
		calculadora2 = new ImpuestoLocalDecorator(calculadora2);
		System.out.println(calculadora2.calcularPrecio(100));
		
		System.out.println("-----Producto 0% local------");

		Calculadora calculadora3 = new SinImpuestosDecorator(calculadora);
		System.out.println(calculadora3.calcularPrecio(100));
		
		
		System.out.println("-----Producto 0% fronterizo------");
		
		Calculadora calculadora4 = new SinImpuestosDecorator(calculadora);
		calculadora4 = new ImpuestoLocalDecorator(calculadora4);
		System.out.println(calculadora4.calcularPrecio(100));

		System.out.println("-----Producto 16% local con descuento------");

		Calculadora calculadora5 = new ImpuestoBaseDecorator(calculadora);
		calculadora5 = new DescuentoDecorator(calculadora5);
		System.out.println(calculadora5.calcularPrecio(100));
		
		System.out.println("-----Producto 0% fronterizo con descuento------");
		
		Calculadora calculadora6 = new SinImpuestosDecorator(calculadora);
		calculadora6 = new ImpuestoLocalDecorator(calculadora6);
		calculadora6 = new DescuentoDecorator(calculadora6);
		System.out.println(calculadora6.calcularPrecio(100));
	}

}
