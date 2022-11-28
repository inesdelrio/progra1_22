package aplicacion; 

import dominio.*; 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal{
	public static void main(String[] args){
		boolean exit = false;
		Inventario inventario = new Inventario(); 
		do{
			try{
				int task = mainMenu(); 
				switch (task){
					case 0: exit = true; break; 
					case 1: inventario.addZapatillas(); break; 
					case 2: inventario.getZapatillas(); break; 
						default break; 
				}
				System.out.println(); 
			}
			catch (IOException ex){
			}
		}
		while(!exit); 
	}
	private static int mainMenu() throws IOException{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("1. Nuevas zapatillas \n" + "2. Ver todas las zapatillas \n" + "0. Salir \n"); 
		System.out.print("Introducir número de acción deseada: "); 
		return Integer.parseInt(input.readLine()); 
	}
}

