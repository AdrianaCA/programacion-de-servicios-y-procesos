package carrera;

public class Animal implements Runnable {
	
	public int velocidad;
	public String nombre;
	public int distancia;
	
	
	public Animal(String nombre) {
		this.nombre = nombre;
		this.distancia = 0;
	}
	
	public void correr() {
		distancia += velocidad;
		this.decirPosicion();
	}
	
	public void decirPosicion() {
		System.out.println("El animal " + nombre + " ha recorrido " + distancia);
	}

	@Override
	public void run() {
		while(true) {
			//System.out.println("Esta es una ejecución de " + this.nombre);
			this.correr();
			
			try {
				Thread.sleep(1000);	// pausa de 1 sengundo
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
