package juego.modelo.cartas;


public class Bonus extends Carta {

	private int nivel;
	private String efecto;

	/**
	 * Bonus(String, TipoCarta, int). Constructor de las cartas de bonus.
	 * 
	 * @param nombre
	 *            Nombre de la carta.
	 * @param tipo
	 *            Tipo de la carta.
	 * @param nivel
	 *            Nivel de la carta.
	 */
	public Bonus(String nombre, TipoCarta tipo, int nivel) {
		super(nombre, tipo);
		this.nivel = nivel;
	}

	/**
	 * consultarNivel(). Consulta el nivel del bonus.
	 * 
	 * @return Nivel del bonus.
	 */
	public int consultarNivel() {
		return nivel;
	}

	/**
	 * consultarEfecto(). Consulta el efecto que tiene.
	 * 
	 * @return Efecto de la carta.
	 */
	public String consultarEfecto() {
		return efecto;
	}

}
