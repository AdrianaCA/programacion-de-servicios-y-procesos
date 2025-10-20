package hilosAlumnos;

public class Alumno implements Runnable {
	
	private String mensaje;
	
	public Alumno(String nombre) {
		if(nombre.toUpperCase().startsWith("S")) {
			this.mensaje = "Hola soy " + nombre + " y este es mi mensaje número ";
		} else {
			this.mensaje = "Mira que ser yo " + nombre + "... Pues me cierro";
		}
	}

	@Override
	public void run() {
		if(Thread.currentThread().isInterrupted()) {
			System.out.println(mensaje);
			return;
		} else {
			for(int i = 1; i < 6; i++) {
				System.out.println(mensaje + i);
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
