package carrera;

public class Main {
	
	public static void main(String[] args) {
		Liebre liebre = new Liebre("Liebre");
		Gallina gallina = new Gallina("Gallina");
		Tortuga tortuga = new Tortuga("Tortuga");
		
		Thread hilo1 = new Thread(liebre);
		hilo1.start();
		
		Thread hilo2 = new Thread(gallina);
		hilo2.start();
		
		Thread hilo3 = new Thread(tortuga);
		hilo3.start();
	}

}
