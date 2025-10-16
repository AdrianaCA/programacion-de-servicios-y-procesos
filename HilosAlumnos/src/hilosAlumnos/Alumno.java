package hilosAlumnos;

public class Alumno implements Runnable {
	
	private String mensaje;
	
	public Alumno(String nombre) {
		this.mensaje = "Hola soy " + nombre + " y este es mi mensaje número ";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
