package Ventana;

public class Pair<T1, T2> {
	public T1 key;
	public T2 value;
	
	public Pair(T1 key, T2 value) {
		this.key=key;
		this.value=value;
	}
	public T1 getKey() {
		return key;
	}
	public T2 getValue() {
		return value;
				
	}
	public void setkey(T1 key) {
		this.key=key;
	}
	public void setValue(T2 value) {
		this.value=value;
	}
	
	public String toString() {
		return "MODELO: "+ key+ "\n"+"Cantidad de unidades vendidas: " +value+"\n";
	}
	
}
