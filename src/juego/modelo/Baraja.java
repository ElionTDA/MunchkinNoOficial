package juego.modelo;

import juego.modelo.cartas.Bonus;
import juego.modelo.cartas.Carta;
import juego.modelo.cartas.Defensa;
import juego.modelo.cartas.Enemigo;
import juego.modelo.cartas.Maldicion;
import juego.modelo.cartas.TipoCarta;

public class Baraja {

	// Dos mazos
	Carta[] puertas;
	Carta[] tesoros;

	// ENEMIGOS
	private String[] nomEnemigo = { "Casco", "Botas", "Pechera", "Armadura",
			"Dentadura", "Caballo", "Armadura Pesada", "arm", "arm2", "ahol" };
	private int[] nivel = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	private int[] tes = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	private int[] lvlUp = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	// DEFENSAS
	private String[] nomDefensa = { "Casco", "Botas", "Pechera", "Armadura",
			"Dentadura", "Caballo", "Armadura Pesada", "arm", "arm2", "ahol" };
	private int[] nivelDefensa = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	// MALDICIONES
	private String[] nomMaldicion = { "Casco", "Botas", "Pechera", "Armadura",
			"Dentadura", "Caballo", "Armadura Pesada", "arm", "arm2", "ahol" };

	// BONUS
	private String[] nomBonus = { "Casco", "Botas", "Pechera", "Armadura",
			"Dentadura", "Caballo", "Armadura Pesada", "arm", "arm2", "ahol" };
	private int[] nivelBonus = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	// MOJOS
	// ¿¿??

	// CANTIDAD DE CARTAS
	private static int contGlobal = 40;

	// Contadores de los tipos de cartas.
	private int contTesoros;
	private int contDef;
	private int contEnem;
	private int contPuertas;
	private int contMald;
	private int contBon;

	// Para los bucles.
	private int i, j;

	/**
	 * Baraja(). Constructor de la baraja.
	 */
	public Baraja() {
		calcularContadores();

		puertas = new Carta[contPuertas];
		tesoros = new Carta[contTesoros];

		// Puertas
		i = 0;
		while (i < contEnem) {
			puertas[i] = new Enemigo(nomEnemigo[i], TipoCarta.ENEMIGO,
					nivel[i], tes[i], lvlUp[i], "Mal royo");
			i++;
		}
		
		j = 0;
		while (i < contPuertas) {
			puertas[i] = new Maldicion(nomMaldicion[j], TipoCarta.MALDICION);
			i++;
			j++;
		}
		
		// Tesoros  kjhl´jñdhfghjfhgj
		i = 0;
		while (i < contBon) {
			tesoros[i] = new Bonus(nomBonus[i], TipoCarta.BONUS, nivelBonus[i]);
			i++;
		}

		j = 0;
		while (i < contTesoros) {
			tesoros[i] = new Defensa(nomDefensa[j], TipoCarta.DEFENSA,
					nivelDefensa[j], "");
			i++;
			j++;
		}
		// Barajamos ambos mazos.
		barajar(puertas);
		barajar(tesoros);
	}

	// ########### metodo privado
	/**
	 * calcularContadores(). Calcula las cartas de cada tipo, en función de que
	 * tamaño tiene el mazo.
	 */
	private void calcularContadores() {
		int aux;

		contEnem = (int) Math.floor(contGlobal / 4);
		contDef = (int) Math.floor(contGlobal / 4);
		contMald = (int) Math.floor(contGlobal / 4);
		contBon = (int) Math.floor(contGlobal / 4);

		contPuertas = contEnem + contMald;
		contTesoros = contBon + contDef;

		aux = contEnem + contDef + contMald + contBon;
		if (aux < 40) {
			aux = contGlobal - aux;
			contEnem = contEnem + aux;
		}
	}

	// ########## fin metodo privado

	/**
	 * consultarMazoPuertas(). Consulta el mazo.
	 * 
	 * @return mazo de la baraja.
	 */
	public Carta[] consultarMazoPuertas() {
		return puertas;
	}

	/**
	 * consultarMazoTesoros(). Consulta las cartas que hay en el array tesoros.
	 * 
	 * @return array tesoros.
	 */
	public Carta[] consultarMazoTesoros() {
		return tesoros;
	}

	/**
	 * barajar(CartaAbstracta[]). Mezcla las cartas 4 veces, para que se mezclen
	 * bien.
	 * 
	 * @param mazo2
	 */
	public void barajar(Carta[] mazo) {
		int i, j; // para los for.
		int n, n1, g; // para los mazos.
		Carta[] aux = new Carta[mazo.length];

		// Se repite el mezclado 3 veces, para evitar que queden seguidas.
		for (j = 0; j < 3; j++) {
			for (i = 0; i < mazo.length; i++) {
				aux[i] = mazo[i];
			}// fin segundo for

			n = 0;
			n1 = mazo.length / 2;

			for (i = 0; i < mazo.length; i++) {
				g = (int) Math.floor(Math.random()*10);

				if (g < 5) {
					if (n < mazo.length / 2) {
						mazo[n] = aux[i];
						n++;
					} else {
						mazo[n1] = aux[i];
						n1++;
					}
				} else { // fin if
					if (n1 < mazo.length) {
						mazo[n1] = aux[i];
						n1++;
					} else {
						mazo[n] = aux[i];
						n++;
					}
				} // fin else
			} // fin tercer for
		} // fin primer for
	}// fin metodo barajar

	public void repartirPuertas(Jugador jugador, int rep) {
		Carta[] aux;
		int num, i;

		aux = jugador.consultarCartasMano();
		num = jugador.consultarNumCartasMano();

		if (jugador.consultarNumCartasMano() + rep <= 20) {
			for (i = 0; i < rep; i++) {
				aux[num] = puertas[contPuertas-1];
				puertas[contPuertas-1] = null;
				contPuertas--;
				num++;
			} // fin for
			jugador.cambiarNumCartasMano(num);
		} // fin if
	}// fin metodo repartir

	public void repartirTesoros(Jugador jugador, int rep) {
		Carta[] aux;
		int num, i;

		aux = jugador.consultarCartasMano();
		num = jugador.consultarNumCartasMano();

		if (jugador.consultarNumCartasMano() + rep <= 20) {
			for (i = 0; i < rep; i++) {
				aux[num] = tesoros[contTesoros-1];
				tesoros[contTesoros-1] = null;
				contTesoros--;
				num++;
			} // fin for
			jugador.cambiarNumCartasMano(num);
		} // fin if
	}// fin metodo repartir
}
