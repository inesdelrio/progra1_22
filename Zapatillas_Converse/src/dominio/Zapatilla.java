package dominio;


	/**
 	* Clase que determina las caracteristicas del objeto principal. 
	 */

public class Zapatilla {
    private String modelo;
    private String color;
    private int precio = 0;
    private int talla = 0;


    public Zapatilla() {
    }

    public Zapatilla(String modelo, String color, int precio, int talla) {
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.talla = talla;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return this.precio;
    }


    public void setTalla(int talla) {
        this.talla = talla;
    }

    public int getTalla() {
        return this.talla;
    }

    /**
     * Método que devuelve la información del objeto. 
     */

    @Override
    public String toString() {
        return "Modelo: " + getModelo() + " Color: " +
                getColor() + " Precio: " + getPrecio() + " Talla: " + getTalla();
    }
}


