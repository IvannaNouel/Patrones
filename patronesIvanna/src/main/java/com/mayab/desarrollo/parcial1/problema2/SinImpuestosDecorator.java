package com.mayab.desarrollo.parcial1.problema2;

public class SinImpuestosDecorator extends Decorator {

	public SinImpuestosDecorator(Calculadora calculadora) {
		super(calculadora);
	}

	@Override
	public double calcularPrecio(double p) {
		
		return this.calculadora.calcularPrecio(p);
	}

}
