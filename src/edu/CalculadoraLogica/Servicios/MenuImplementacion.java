package edu.CalculadoraLogica.Servicios;

import java.util.Scanner;

public class MenuImplementacion  implements MenuInterfaz {

	Scanner sc = new Scanner(System.in);
	
	public int MostrarMenuYSeleccion() {
		
	int opcion;
	
	
		System.out.println("********************");
        System.out.println("*       MENÚ         *");
        System.out.println("********************");
        System.out.println("0. Cerrar");
        System.out.println("1. Igualdad");
        System.out.println("2. Desigualdad");
        System.out.println("----------------------");
        System.out.print("Seleccione una opción: ");
        
        opcion = sc.nextInt();
        
		return opcion;
	}

	
}
