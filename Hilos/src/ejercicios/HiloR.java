package ejercicios;

public class HiloR implements Runnable {
	
	private String mensaje;
	
	public HiloR(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(mensaje);
		}
	}

}
