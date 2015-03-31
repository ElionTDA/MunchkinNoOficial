package juego.control;

import juego.modelo.Baraja;
import juego.modelo.Jugador;

public class Arbitro {
	private static int N_JUG = 2;
	private String[] nombres = { "Diego", "Juan" };
	private int i;
	private Baraja baraja;
	private Jugador[] jugadores;

	public Arbitro() {
		jugadores = new Jugador[N_JUG];
		for (i = 0; i < N_JUG; i++) {
			jugadores[i] = new Jugador(nombres[i]);
		}

		baraja = new Baraja();

		repartirIni();

	}

	private void repartirIni() {
		int i;
		for (i = 0; i < N_JUG; i++) {
			baraja.repartirPuertas(jugadores[i], 4);
			baraja.repartirTesoros(jugadores[i], 4);
		}
	}

}
