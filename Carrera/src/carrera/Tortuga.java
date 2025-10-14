package carrera;

public class Tortuga extends Animal {

	public Tortuga(String nombre) {
		super(nombre);
		this.velocidad = 1;
	}
	
	public void correr() {
		this.distancia += this.velocidad;
		this.decirPosicion();
	}

}
