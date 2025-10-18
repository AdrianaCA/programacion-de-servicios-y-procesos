package hilosAlumnos;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Thread[] hilos = new Thread[3];
		
		for(int i = 0; i < hilos.length; i++) {
			System.out.println("Introduce el nombre del alumno " + (i+1) + ":");
			String n = sc.nextLine();
			hilos[i] = new Thread(new Alumno(n));
			
			if(!n.toUpperCase().startsWith("S")) {
				hilos[i].interrupt();
			}
		}
		
		for(int i = 0; i < hilos.length; i++) {
			hilos[i].start();
			
			try {
				hilos[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
