package refugio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Animal> animales = new ArrayList<Animal>();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Menú:");
		System.out.println("1.Añadir Animal");
		System.out.println("2.Mostrar datos de todos los animales del refugio");
		System.out.println("0.Salir");
		System.out.println("Escoja una opción:");
		
		int opcion = s.nextInt();
		
		while(opcion != 0) {
			// añadir animal
			if(opcion == 1) {
				System.out.println("¿Quiere añadir un gato o un perro?");
				System.out.println("1.Gato");
				System.out.println("2.Perro");
				
				int a = s.nextInt();
				
				while(a != 1 && a != 2) {
					System.out.println("Opción no válida");
					a = s.nextInt();
				}
				
				// pedir el nombre
				System.out.println("Introduzca el nombre:");
				String nombre = s.next();
				
				// pedir la edad
				System.out.println("Introduzca la edad:");
				int edad = s.nextInt();
				s.nextLine();
				
				if(a == 1) {
					System.out.println("Introduzca la longitud de los bigotes:");
					int longitudBigotes = s.nextInt();
					
					animales.add(new Gato(nombre, edad, longitudBigotes));
				} else if(a == 2) {
					System.out.println("Introduzca la raza:");
					String raza = s.nextLine();
					
					animales.add(new Perro(nombre, edad, raza));
				}
				
				System.out.println("Animal añadido");
			} else if(opcion == 2) {  // mostrar informacion
				System.out.println("Animales añadidos:");
				
				for(int i = 0; i < animales.size(); i++) {
					System.out.print(i + ".");
					animales.get(i).mostrarDatos();
					System.out.println();
				}
			} else {  // opcion no es valida
				System.out.println("Opción no válida");
			}
			
			System.out.println("Introduzca otra opción:");
			
			opcion = s.nextInt();
		}
	}

}
