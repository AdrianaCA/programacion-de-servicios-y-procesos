package poo;

public class Moto {
	
	static String descripcion = "Vehículo de dos ruedas";
	String color;
	
	
	public void pintar(String color) {
		this.color = color;
	}
	
	public static void escribirDescripcion() {
		System.out.println(descripcion);
	}

}
