package juego.modelo.cartas;


public class Maldicion extends Carta {

	private String efecto;

	/**
	 * Maldicion(String, TipoCarta). Constructor de la carta maldici�n.
	 * 
	 * @param nombre
	 *            Nombre de la carta.
	 * @param tipo
	 *            Tipo de la carta.
	 */
	public Maldicion(String nombre, TipoCarta tipo) {
		super(nombre, tipo);
	}

	/**
	 * consultarEfecto(). Consulta el efecto que tiene esta maldici�n.
	 * 
	 * @return Efecto que tiene esta maldici�n.
	 */
	public String consultarEfecto() {
		return efecto;
	}

}
