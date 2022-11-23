package dominio; 

import java.io.File; 
import java.io.FIleNotFounfException; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.util.ArrayList; 
import java.util.Scanner; 

public class Inventario{
	private String nombreFichero = "zapatillas.txt"; 
	private ArrayList<Zapatilla> zapatilla = new ArrayList<>(); 

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder(); 
		for(Zapatilla zapatilla : zapatillas){
			sb.append(zapatilla + "\n"); 
		}
		return sb.toString(); 
	}

	public Inventario(){
		try{
			File fichero = new File(nombreFichero); 
			fichero.createNewFile() ;
			Scanner sc = new Scannner(fichero); 
			while(sc.hasNext()){
				Zapatilla zapatilla = new Zapatilla(); 
				zapatilla.setColor(sc.nextLine()); 
				
