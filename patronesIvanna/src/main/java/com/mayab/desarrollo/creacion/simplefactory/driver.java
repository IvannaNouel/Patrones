package com.mayab.desarrollo.creacion.simplefactory;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrianguloFactory factory = new TrianguloFactory();
		
		Triangulo triangulo1 = factory.createTriangulo("Escaleno");
		System.out.println(triangulo1.toString());
		
		Triangulo triangulo2 = factory.createTriangulo("Equilatero");
		System.out.println(triangulo2.toString());
		
		Triangulo triangulo3 = factory.createTriangulo("Isoseles");
		System.out.println(triangulo3.toString());
	}

}
