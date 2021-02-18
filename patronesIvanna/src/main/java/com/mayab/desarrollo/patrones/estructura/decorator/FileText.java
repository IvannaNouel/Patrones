package com.mayab.desarrollo.patrones.estructura.decorator;

public class FileText extends File{
	public String read() {
		return "Reading data";
	}

	@Override
	public String write() {
		return "Writing data ";
	}
}
