package juego.modelo.cartas;


public class Enemigo extends Carta {

	private int nivel;
	private int tesoros;
	private int lvlUp;
	private String malRoyo;

	/**
	 * Enemigo(String, TipoCarta, int, int, int, String). Constructor de las
	 * clases enemigos.
	 * 
	 * @param nombre Nombre de la carta.
	 * @param tipo Tipo de la carta.
	 * @param nivel Nivel de la carta.
	 * @param tesoros Tesoros de la carta.
	 * @param lvlUp Lvls que da la carta si la derrotas.
	 * @param malRoyo Lo que sucede si pierdes contra esta carta.
	 */
	public Enemigo(String nombre, TipoCarta tipo, int nivel, int tesoros,
			int lvlUp, String malRoyo) {
		super(nombre, tipo);
		this.nivel = nivel;
		this.tesoros = tesoros;
		this.lvlUp = lvlUp;
		this.malRoyo = malRoyo;
	}

	/**
	 * consultarNivel(). Consulta el nivel del enemigo.
	 * 
	 * @return nivel del enemigo.
	 */
	public int consultarNivel() {
		return nivel;
	}

	/**
	 * consultarTesoros(). Consulta los tesoros que te llevas si el jugador gana
	 * al enemigo.
	 * 
	 * @return tesoros que se lleva el jugador que gana.
	 */
	public int consultarTesoros() {
		return tesoros;
	}

	/**
	 * consultarLvlUp(). Consultar la cantidad de niveles que se gana el jugador
	 * que vence al enemigo.
	 * 
	 * @return niveles que gana el jugador que vence al enemigo.
	 */
	public int consultarLvlUp() {
		return lvlUp;
	}

	/**
	 * consultarMalRoyo(). Consulta lo que pasa si un jugador pierde contra el
	 * enemigo.
	 * 
	 * @return Mal Royo del enemigo.
	 */
	public String consultarMalRoyo() {
		return malRoyo;
	}

}
