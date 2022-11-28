package dominio; 

import java.io.File; 
import java.io.FIleNotFounfException; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.util.ArrayList; 
import java.util.Scanner; 

/*public class Inventario{
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

*/

public class Inventario{
	private ArrayList<Zapatilla> zapatillas = new ArrayList<>(); 

	public void addZapatilla() throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); 
		Zapatilla newZapatilla = new Zapatilla(); 
		System.out.print("Modelo de las zapatillas: "); 
		newZapatilla.setModelo(input.readLine()); 
		System.out.print("Color de las zapatillas: "); 
		newZapatilla.setColor(input.readLine()); 
		System.out.print("Precio de las zapatillas: "); 
		newZapatilla.setPrecio(Integer.parseInt(input.readLine())); 
		System.out.print("Talla de las zapatillas: "); 
		newZapatilla.setTalla(Integer.parseInt(input.readLine())); 
	}

	public void getZapatillas(){
		for (Zapatilla zapatilla : zapatillas){
			System.out.println(zapatilla); 
		}
	}
}

