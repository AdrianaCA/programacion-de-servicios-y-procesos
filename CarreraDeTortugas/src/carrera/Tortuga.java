package carrera;

import java.util.concurrent.Semaphore;

public class Tortuga extends Thread {
	
	private String nombre;
	private int velocidad = 1;
	private int posicion = 0;
	private Semaphore semaphore;
	
	
	public Tortuga(String nombre, Semaphore semaphore) {
		this.nombre = nombre;
		this.semaphore = semaphore;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void correr() {
		posicion += velocidad;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			while(posicion < 20) {
				correr();
			}
			
			semaphore.acquire();
			System.out.println(nombre + " entra al tunel");
			
			while(posicion < 30) {
				correr();
			}
			
			semaphore.release();
			System.out.println(nombre + " sale del tunel");
			
			while(posicion < 40) {
				correr();
			}
			System.out.println(nombre + " llegó a la meta");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
