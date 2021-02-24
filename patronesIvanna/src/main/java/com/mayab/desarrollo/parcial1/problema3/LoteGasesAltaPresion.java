package com.mayab.desarrollo.parcial1.problema3;

public class LoteGasesAltaPresion extends ProductosDeGas{

	@Override
	public void RegistrarIniciales() {
		
		System.out.println("El uso de la bomba: si \n"
						+  "Horas de uso: 5hrs \n"
						+  "Nivel de materia prima: 8% \n");
 
	}

	@Override
	public void RegistrarFinal() {
		
		System.out.println("Nivel de materia prima: 1% \n"
				+  "Temperatura de envases llenado: 23C \n"
				+  "Presión de los envases: 60atm \n");
		
	}

	@Override
	public void CalcularVolumen() {
		
		System.out.println("Calculando Volumen con formula de la empresa \n");
	}

	@Override
	public void InspeccionSeguridad() {

		System.out.println("Revisando todo con mucho detalle los gases de alta presion \n");

	}

}
