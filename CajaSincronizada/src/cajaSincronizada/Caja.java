package cajaSincronizada;

public class Caja {
	
	private double total = 0;
	
	
	public synchronized void cobrar(double cantidad) {
		this.total += cantidad;
	}
	
	public synchronized double getTotal() {
		return Math.round(total * 100.00) / 100.00;
	}

}
