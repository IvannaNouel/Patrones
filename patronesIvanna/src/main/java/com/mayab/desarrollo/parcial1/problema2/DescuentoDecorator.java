package com.mayab.desarrollo.parcial1.problema2;

public class DescuentoDecorator extends Decorator{

	public DescuentoDecorator(Calculadora calculadora) {
		super(calculadora);
	}

	@Override
	public double calcularPrecio(double p) {
		
		double precio = this.calculadora.calcularPrecio(p);
		
		//Utilice 10% de descuento como ejemplo
		
		return precio - p * 0.10;
	}

}
