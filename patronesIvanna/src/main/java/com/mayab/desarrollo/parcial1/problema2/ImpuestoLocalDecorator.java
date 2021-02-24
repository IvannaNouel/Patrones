package com.mayab.desarrollo.parcial1.problema2;

public class ImpuestoLocalDecorator extends Decorator{

	public ImpuestoLocalDecorator(Calculadora calculadora) {
		super(calculadora);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calcularPrecio(double p) {
		
		return this.calculadora.calcularPrecio(p) + p * 0.02;
	}

}
