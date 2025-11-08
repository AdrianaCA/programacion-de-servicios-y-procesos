package carrera;

import java.util.concurrent.Semaphore;

public class Main {
	
	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(1);
		
		Tortuga t1 = new Tortuga("Juana", semaphore);
		Tortuga t2 = new Tortuga("Josefina", semaphore);
		Tortuga t3 = new Tortuga("Juliana", semaphore);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
