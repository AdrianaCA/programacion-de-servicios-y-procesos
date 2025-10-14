package carrera;

import java.util.Random;

public class Gallina extends Animal {
	
	public int velocidadVolar = 15;

	public Gallina(String nombre) {
		super(nombre);
		this.velocidad = 3;
	}
	
	public void correr() {
		Random r = new Random();
		
		int n = r.nextInt(0, 3);
		
		if(n == 0) {
			this.distancia += this.velocidad;
		} else if(n == 1) {
			this.distancia += this.velocidadVolar;
		} else {
			System.out.println("La gallina ha puesto un huevo");
		}
	}

}
