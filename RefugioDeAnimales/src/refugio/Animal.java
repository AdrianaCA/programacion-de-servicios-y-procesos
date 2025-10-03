package refugio;

public class Animal {
	
	String nombre;
	int edad;
	
	
	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void mostrarDatos() {
		System.out.print("Nombre: " + nombre + ", edad: " + edad);
	}

}
