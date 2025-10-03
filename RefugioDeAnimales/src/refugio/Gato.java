package refugio;

public class Gato extends Animal {
	
	int longitudBigotes;
	

	public Gato(String nombre, int edad, int longitudBigotes) {
		super(nombre, edad);
		this.longitudBigotes = longitudBigotes;
	}
	
	public void maullar() {
		System.out.println("Miau miau");
	}
	
	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.print(", bigotes: " + longitudBigotes);
	}

}
