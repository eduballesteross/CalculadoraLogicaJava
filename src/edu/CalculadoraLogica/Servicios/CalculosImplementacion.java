package edu.CalculadoraLogica.Servicios;

import java.util.Scanner;

public class CalculosImplementacion implements CalculosInterfaz {
	
	Scanner sc = new Scanner(System.in);
	
	public String Igualdad() {
		
		String comparacion;
		
		do {
			
			System.out.println("Introduzca la palabra a comparar");
			comparacion = sc.nextLine();	
			
			if(!comparacion.isEmpty()) {
				return comparacion;
			}else {System.out.println("[ERROR]. Debe ingresar un String.");}
			
		}while(true);
		
		
	}

}


