package dominio;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Inventario {
    private ArrayList<Zapatilla> zapatillas = new ArrayList<>();
    private String nombreFichero = "zapatillas.txt";

    /**
     * Método para poder cargar los datos del fichero
     */
    public Inventario() {
        try {
            File fichero = new File(nombreFichero);
            fichero.createNewFile();
            Scanner sc = new Scanner(fichero);
            while (sc.hasNext()) {
                Zapatilla zapatilla = new Zapatilla();
                zapatilla.setModelo(sc.nextLine());
                zapatilla.setColor(sc.nextLine());
                zapatilla.setPrecio(sc.nextInt());
                sc.nextLine();
                zapatilla.setTalla(sc.nextInt());
                sc.nextLine();
                zapatillas.add(zapatilla);
            }
        } catch (IOException exception) {
            System.err.println(exception);
        }
    }

    /**
     * Método para añadir una zapatilla
     *
     * @param modelo Modelo de la sudadera
     * @param color  Color de la sudadera
     * @param precio Precio de la sudadera
     * @param talla  Talla de la sudadera
     */
    public void addZapatillas(String modelo, String color, int precio, int talla) {
        Zapatilla zapatilla = new Zapatilla(modelo, color, precio, talla);
        zapatillas.add(zapatilla);
        this.volcarZapatillas();
    }

    /**
     * Método para añadir una zapatilla al fichero txt
     */
    private void volcarZapatillas() {
        try {
            FileWriter fw = new FileWriter(nombreFichero);
            for (Zapatilla zapatilla : zapatillas) {
                fw.write(zapatilla.getModelo() + "\n");
                fw.write(zapatilla.getColor() + "\n");
                fw.write(zapatilla.getPrecio() + "\n");
                fw.write(zapatilla.getTalla() + "\n");
            }
            fw.close();
        } catch (IOException exception) {
            System.err.println(exception);
        }
    }

    /**
     * Método para devolver la información en formato String
     *
     * @return Información en formato string
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Zapatilla zapatilla : zapatillas) {
            sb.append(zapatilla + "\n");
        }
        return sb.toString();
    }
}

