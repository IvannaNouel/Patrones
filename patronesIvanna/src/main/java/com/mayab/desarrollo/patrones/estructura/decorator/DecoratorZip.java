package com.mayab.desarrollo.patrones.estructura.decorator;

public class DecoratorZip extends Decorator{
	
	File file;
	
	public DecoratorZip(File file) {
		this.file = file;
	}
	
	@Override
	public String read(){
		return "Decompressing data: " + file.read();
	}

	@Override
	public String  write(){
		return "Compressing data: " + file.write();
	}
	
}
