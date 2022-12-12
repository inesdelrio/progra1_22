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
     * @param zapatillaABorrar
     */
    public void borrarZapatilla(Zapatilla zapatillaABorrar) {
        String modelo = zapatillaABorrar.getModelo();
        String color = zapatillaABorrar.getColor();
        int precio = zapatillaABorrar.getPrecio();
        int talla = zapatillaABorrar.getTalla();
        int i = 0;
        boolean encontrado = false;
        while (i <= zapatillas.size() && !encontrado) {
            if (zapatillas.get(i).getModelo().equals(modelo) && zapatillas.get(i).getColor().equals(color)
                    && zapatillas.get(i).getPrecio() == precio && zapatillas.get(i).getTalla() == talla) {
                encontrado = true;
                break;
            }
            i++;
        }
        if (encontrado) {
            zapatillas.remove(i);
            volcarZapatillas();
            System.out.println("Se ha eliminado correctamente");
        } else {
            System.out.println("No se ha encontrado la zapatilla");
        }
    }

    /**
     *
     * @param televisionAntigua
     * @param televisionNueva
     */
    public void reemplazarZapatilla(Zapatilla zapatillaAntigua, Zapatilla zapatillaNueva) {
        String modelo = zapatillaAntigua.getModelo();
        String color = zapatillaAntigua.getColor();
        int precio = zapatillaAntigua.getPrecio();
        int talla = zapatillaAntigua.getTalla();
        int i = 0;
        boolean encontrado = false;
        while (i <= zapatillas.size() && !encontrado) {
            if (zapatillas.get(i).getModelo().equals(modelo) && zapatillas.get(i).getColor().equals(color)
                    && zapatillas.get(i).getPrecio() == precio && zapatillas.get(i).getTalla() == talla) {
                encontrado = true;
                break;
            }
            i++;
        }
        if (encontrado) {
            zapatillas.set(i, zapatillaNueva);
            volcarZapatillas();
            System.out.println("Se ha reemplazado");
        } else {
            System.out.println("No se ha encontrado la zapatilla");
        }
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




