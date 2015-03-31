package util;

import juego.control.Arbitro;

public class Juego {
	
	public static void main(String[] args) {
		double t, t1;
		
		System.out.println("Inicio");
		t = System.currentTimeMillis();
		new Arbitro();
		t1 = System.currentTimeMillis();
		System.out.println("Fin");
		System.out.println("Tiempo: " + (t1 - t)); 
	}

}
