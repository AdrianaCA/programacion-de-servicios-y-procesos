package cajaSincronizada;

public class Main {
	
	public static void main(String[] args) {
		Caja caja = new Caja();
		
		Thread empleado1 = new Thread(new Empleado("Ana", caja));
		Thread empleado2 = new Thread(new Empleado("Luis", caja));
		Thread empleado3 = new Thread(new Empleado("María", caja));
		
		empleado1.start();
		empleado2.start();
		empleado3.start();
		
		try {
			empleado1.join();
			empleado2.join();
			empleado3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Total final en la caja: " + caja.getTotal() + "\u20AC");
	}

}
