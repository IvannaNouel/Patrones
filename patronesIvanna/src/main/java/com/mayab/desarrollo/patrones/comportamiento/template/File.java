package com.mayab.desarrollo.patrones.comportamiento.template;

public abstract class File {
	
	public final void processFile() {
		
		read();
		open();
		writeDB();
		valid();
		
	}

	public abstract void valid(); 
		
	final void open() {
		System.out.println("Opening File");
		
	}
	public abstract void read();
			
	final void writeDB() {
		System.out.println("Wrinting data on DB");
			
	}
		
}
	