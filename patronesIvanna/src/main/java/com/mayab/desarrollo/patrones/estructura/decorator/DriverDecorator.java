package com.mayab.desarrollo.patrones.estructura.decorator;

public class DriverDecorator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new FileText();
		
		System.out.println("-----File 1------");

		System.out.println(file.write());
		System.out.println(file.read());
		
		
		System.out.println("-----File 2------");

		File file2 = new FileText();
		file2 = new DecoratorZip(file2);
		System.out.println(file2.write());
		System.out.println(file2.read());
		
		System.out.println("-----File 3------");


		File file3 = new FileText();
		file3 = new DecoratorZip(file3);
		file3 = new DecoratorEncrypt(file3);
		System.out.println(file3.write());
		System.out.println(file3.read());
	}

}
