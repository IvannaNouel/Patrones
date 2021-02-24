package com.mayab.desarrollo.parcial1.problema4;

public class BDDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasedeDatosA A = new BasedeDatosA();
		BasedeDatosB B = new BasedeDatosB();
		BasedeDatosC C = new BasedeDatosC();
		
		
		System.out.println("---Base de Datos A---");
		A.guardar();
		System.out.println("---Base de Datos B---");
		B.guardar();
		System.out.println("---Base de Datos C---");
		C.guardar();
	}

}
