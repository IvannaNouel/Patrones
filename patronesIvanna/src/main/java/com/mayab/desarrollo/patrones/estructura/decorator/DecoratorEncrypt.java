package com.mayab.desarrollo.patrones.estructura.decorator;

public class DecoratorEncrypt extends Decorator {
	
	File file;
	
	public DecoratorEncrypt(File file) {
		this.file = file;
	}
	
	@Override
	public String read(){
		return "Decrypted data: " + file.read();
	}

	@Override
	public String  write(){
		return "Encrypting data: " + file.write();
	}
}
