package com.mayab.desarrollo.patrones.estructura.proxy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReporteVentas implements Reporte {
	
	
	public ReporteVentas() {
		//
		
	}
	@Override
	public void read() {
		
		try {
			
			System.out.println("Reading File");
			File file = new File("file.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) 
			
			{
			String data = sc.nextLine();
			System.out.println(data);
			}

			sc.close();
		} 
		
		catch(Exception e){System.out.println(e);}    
	}

	@Override
	public void write(String s) {
		  try{    
	           FileWriter fw=new FileWriter("file.txt");    
	           fw.write(s);    
	           fw.close(); 
				System.out.println("--New File--");

	          }catch(Exception e){System.out.println(e);}    
	     }    

}
