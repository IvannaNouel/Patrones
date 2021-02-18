package com.mayab.desarrollo.patrones.creacion.abstracMubles;

public class MueblesStore {
	MueblesFactory factory;
	Mesa mesa;
	Silla silla;
	Sofa sofa;
	void createSala(String tipo)
	{
		if(tipo=="Moderna") {
			 factory = new MueblesModernosFactory();
			 
		 } else if (tipo == "Ochentera") {
			 factory = new MueblesOchenterosFactory();
			 
		 } else if (tipo == "Victoriana") {
			 factory = new MueblesVictorianosFactory();
		 }
	
		
		mesa = factory.createMesa();
		silla = factory.createSilla();
		sofa= factory.createSofa();
	}

	void entregarSala() {
		System.out.println(mesa.getType());
		System.out.println(silla.getType());
		System.out.println(sofa.getType());

	}
}
