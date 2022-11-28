package dominio;

public class Zapatilla 
{ 
	private String modelo; 
	private String color; 
	private int precio = 0;
	private int talla = 0;



	public Zapatilla(){
	}

	public Zapatilla (String modelo, String color, int precio, int talla){
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


	public void setColor(String color){
		this.color = color; 
	}
	public String getColor(){
		return color; 
	}

	
	public void setPrecio(int precio){
		this.precio = precio; 
	}
	public int getPrecio(){
		return this.precio; 
	}

	
	public void setTalla(int talla){
		this.talla = talla; 
	}
	public int getTalla(){
		return this.talla; 
	}

	

	@Override
	public String toString(){
		return ("El modelo de las zapatillas es: " + this.modelo + ", el color es " + this.color + ", su precio es " + this.color + " y su talla es la " + this.talla + "." ); 
	}
}


