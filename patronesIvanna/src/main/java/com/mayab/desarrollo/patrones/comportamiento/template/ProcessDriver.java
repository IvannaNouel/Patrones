package com.mayab.desarrollo.patrones.comportamiento.template;

public class ProcessDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProcessJson j = new ProcessJson();
		ProcessExcel e = new ProcessExcel();
		
		
		System.out.println("---Json---");
		j.processFile();
		System.out.println("---Excel---");
		e.processFile();


	}

}
