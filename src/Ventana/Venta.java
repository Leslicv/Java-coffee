package Ventana;



public class Venta {
	 String bebida;
	 double precio;
	 int numero;
	

	
	public Venta() {
		
	}
	
	public Venta(String bebida, double precio, int numero) {
		this.bebida=bebida;
		this.precio=precio;
		this.numero=numero;
		
	}
	
	public void setBebida(String bebida) {
		this.bebida=bebida;
	}
	public void setNumero(int numero) {
		this.numero=numero;
	}
	public void setPrecio(double precio) {
		this.precio=precio;
	}
	
		
	public String getBebida() {
		return bebida;
	}
	public double getPrecio() {
		return precio;
	}
	public int getNumero() {
		return numero;
	}

	
		
	
	public String toString() {
		String cadena;
		cadena="Nombre "+ bebida+ " Precio: "+precio +"\n"+ 
		"numero totales de bebidas: "+numero+"\n"; 
				
				return cadena;
		
	}
}
