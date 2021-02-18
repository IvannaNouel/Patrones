package com.mayab.desarrollo.patrones.creacion.abstracMubles;

public class mueblesDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MueblesStore tienda = new MueblesStore();
		
		tienda.createSala("Moderna");
		tienda.entregarSala();
		
		System.out.println("------------------------");
		
		tienda.createSala("Victoriana");
		tienda.entregarSala();
	
		System.out.println("------------------------");
		
		tienda.createSala("Ochentera");
		tienda.entregarSala();
	}

}
