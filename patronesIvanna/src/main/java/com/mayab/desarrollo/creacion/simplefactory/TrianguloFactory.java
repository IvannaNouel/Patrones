package com.mayab.desarrollo.creacion.simplefactory;

public class TrianguloFactory {
	
	public Triangulo createTriangulo(String type) {
		if( type == "Equilatero") {
			return new Equilatero();
		} else if (type == "Isoseles") {
			return new Isoseles();
		} else if (type == "Escaleno") {
			return new Escaleno();
		}
		return null;
	}
}
