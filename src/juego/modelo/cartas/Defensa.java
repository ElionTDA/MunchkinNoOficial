package juego.modelo.cartas;


public class Defensa extends Carta {

	private int bonus;
	private String parteCuerpo;

	/**
	 * Defensa(String, TipoCarta, int, String). Constructor de las cartas de
	 * defensa.
	 * 
	 * @param nombre
	 *            Nombre de la carta.
	 * @param tipo
	 *            Tipo de la carta.
	 * @param bonus
	 *            Bonus de la carta.
	 * @param parteCuerpo
	 *            Parte del cuerpo de la carta.
	 */
	public Defensa(String nombre, TipoCarta tipo, int bonus, String parteCuerpo) {
		super(nombre, tipo);
		this.bonus = bonus;
	}

	/**
	 * consultarBonus(). Consulta el bonus de defensa que da.
	 * 
	 * @return Bonus que da el objeto.
	 */
	public int consultarBonus() {
		return bonus;
	}

	/**
	 * consultarParteCuerpo(). Consulta la parte del cuerpo necesaria para usar
	 * este objeto.
	 * 
	 * @return parte del cuerpo que ocupa esta defensa.
	 */
	public String consultarParteCuerpo() {
		return parteCuerpo;
	}

}
