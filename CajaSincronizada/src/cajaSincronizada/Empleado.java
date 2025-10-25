package cajaSincronizada;

public class Empleado implements Runnable {
	
	private String nombre;
	private Caja caja;
	
	
	public Empleado(String nombre, Caja caja) {
		this.nombre = nombre;
		this.caja = caja;
	}

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			double cantidad = 100;
			caja.cobrar(cantidad);
			System.out.println("Empleado " + nombre + " cobró " + cantidad + "\u20AC. Total en caja: " + caja.getTotal() + "\u20AC");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
