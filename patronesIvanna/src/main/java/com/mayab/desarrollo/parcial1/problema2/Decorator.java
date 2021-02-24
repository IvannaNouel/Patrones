package com.mayab.desarrollo.parcial1.problema2;

public abstract class Decorator implements Calculadora{
	
	protected Calculadora calculadora;

	public Decorator(Calculadora calculadora) {
		super();
		this.calculadora = calculadora;
	}
	
	public double calcularPrecio(double p) {
		
		return this.calculadora.calcularPrecio(p);
	}
}
