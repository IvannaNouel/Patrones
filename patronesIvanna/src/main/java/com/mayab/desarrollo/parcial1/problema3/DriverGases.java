package com.mayab.desarrollo.parcial1.problema3;

public class DriverGases {

	public static void main(String[] args) {

		ProductosDeGas P = new LoteGasesAltaPresion();
		ProductosDeGas L = new LoteGasesLiquidos();
		ProductosDeGas A = new LoteGasesAcetileno();
		
		System.out.println("---Gases Alta Presion--- \n");
		P.guardar();
		System.out.println("---Gases Liquidos--- \n");
		L.guardar();
		System.out.println("---Gases Acetileno---\n");
		A.guardar();
		
	}

}
