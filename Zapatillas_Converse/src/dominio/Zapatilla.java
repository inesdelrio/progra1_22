package dominio;

public class Zapatilla 
{ 
	private String modelo; 
	private String color; 
	private int precio;
	private int talla; 

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

	//public
	//
	

	@Override
	public String toString(){
		return "modelo: " + getModelo() + " " + 
			"color: " + getColor() + " " +
			//"precio: " +
	}

