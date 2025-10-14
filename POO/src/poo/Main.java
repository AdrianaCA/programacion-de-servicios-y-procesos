package poo;

public class Main {
	
	public static void main(String[] args) {
		Moto moto1 = new Moto();
		Moto moto2 = new Moto();
		
		moto1.pintar("rojo");
		moto2.pintar("verde");
		
		System.out.println(moto1.descripcion + ", " + moto1.color);
		System.out.println(moto2.descripcion + ", " + moto2.color);
		
		moto1.descripcion = "Hola";
		
		System.out.println(moto1.descripcion + ", " + moto1.color);
		System.out.println(moto2.descripcion + ", " + moto2.color);
	}

}
