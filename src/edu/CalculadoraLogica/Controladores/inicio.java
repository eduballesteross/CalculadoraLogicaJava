package edu.CalculadoraLogica.Controladores;

import edu.CalculadoraLogica.Servicios.*;	

public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuInterfaz menuI = new MenuImplementacion();
		CalculosInterfaz calculoI = new CalculosImplementacion();

	int opcion;
	boolean cerrarMenu= false;
	
	do {
		opcion=menuI.MostrarMenuYSeleccion();
		 
		
		
			switch(opcion) {
			case 0:
				System.out.println("[INFO] Has cerrado la aplicacion.");
				cerrarMenu=true;
				break;
			case 1:
				String comparacionUno;
				String comparacionDos;
				
				System.out.println("Has seleccionado la opcion Igualdad.");
				
				comparacionUno=calculoI.Igualdad();
				System.out.println("*********************************");
				comparacionDos=calculoI.Igualdad();
				
				if (comparacionUno.equals(comparacionDos)) {
					System.out.println("Resultado de la igualdad: true");
					
				}else {
					 System.out.println("Resultado de la igualdad: false");
				}
				
				
				break;
				
			case 2:
				System.out.println("Has seleccionado la opcion Desigualdad");
				String comparacionUnoII;
				String comparacionDosII;
				
						
				comparacionUnoII=calculoI.Igualdad();
				System.out.println("*********************************");
				comparacionDosII=calculoI.Igualdad();
				
				if (comparacionUnoII.equals(comparacionDosII)) {
					System.out.println("Resultado de la desigualdad: false");
					
				}else {
					 System.out.println("Resultado de la desigualdad: true");
				}
				
				break;
			default:
				System.out.println("[ALERT Has introducido un caracter incorrecto]");
				break;
			}
		
		
	}while(opcion !=0);
	
	
		
	}

}
