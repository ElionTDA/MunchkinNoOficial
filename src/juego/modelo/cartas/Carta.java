package juego.modelo.cartas;


public class Carta {

	private String nombre;
	private TipoCarta tipo;
	private String img;
	private String texto;

	/**
	 * CartaAbstracta(String, TipoCarta). Constructor de CartaAbstracta.
	 * Establece el nombre y tipo de la carta.
	 * 
	 * @param nombre
	 *            Nombre de la carta.
	 * @param tipo
	 *            Tipo de la carta.
	 */
	public Carta(String nombre, TipoCarta tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}

	/**
	 * conultarTipo(). Consulta el tipo de la carta.
	 * 
	 * @return tipo de la carta.
	 */
	public TipoCarta consultarTipo() {
		return tipo;
	}

	/**
	 * consultarNombre(). Consulta el nombre de la carta.
	 * 
	 * @return nombre de la carta
	 */
	public String consultarNombre() {
		return nombre;
	}

	/**
	 * consultarImagen(). Consulta la imagen asociada.
	 * 
	 * @return
	 */
	public String consultarImagen() {
		return img;
	}

	/**
	 * consultarTexto(). Consulta el texto asociado a la imagen.
	 * 
	 * @return
	 */
	public String consultarTexto() {
		return texto;
	}
}
