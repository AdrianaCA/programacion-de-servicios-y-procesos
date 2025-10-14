package ejercicios;

public class HiloT extends Thread {
	
	private String mensaje;
	
	public HiloT(String mensaje) {
		this.mensaje = mensaje;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(mensaje);
		}
	}

}
