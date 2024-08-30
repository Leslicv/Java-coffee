package Ventana;

public class Bebida {
	public String nombre, tamano;
	public double precio;
	public int shots;
	public String leche,crema;
	
	public Bebida(String nombre, String tamano, double precio, int shot, String leche, String crema) {
		
		this.nombre=nombre;
		this.tamano=tamano;
		this.crema=crema;
		this.leche=leche;
		this.precio=precio;
		this.shots=shot;
		
	}
	
	void setPrecio(double precio) {
		this.precio=precio;
	}

	 void setTamano(String tamano) {
		this.tamano=tamano;
		
	}
	 void setCrema(String crema) {
			this.crema=crema;
			
		}
	 void setLeche(String leche) {
			this.leche=leche;
			
		}
	 void setShot(int shot) {
			this.shots=shot;
			
		}

	 void getNombre() {
		// TODO Auto-generated method stub
		
	}

}
