package juego.modelo;

import juego.modelo.cartas.Carta;

public class Jugador {

	private String nombre;
	private boolean turno;
	private int i;
	private Carta[] cartasMano = new Carta[20];
	private Carta[] cartasMesa = new Carta[20];

	private int numCartMano;
	private int numCartMesa;

	
	public Jugador(String nombre) {
		this.nombre = nombre;
		numCartMano = 0;
		numCartMesa = 0;
		for (i = 0; i < 20; i++) {
			cartasMesa[i] = null;
			cartasMano[i] = null;
		}
	}

	
	public String consultarNombre() {
		return nombre;
	}

	public boolean consultarTurno() {
		return turno;
	}

	public void cambiarTurno() {
		turno = !turno;
	}

	public Carta[] consultarCartasMano() {
		return cartasMano;
	}

	public Carta[] consultarCartasMesa() {
		return cartasMesa;
	}
	
	public int consultarNumCartasMano(){
		return numCartMano;
	}
	
	public int consultarNumCartasMesa(){
		return numCartMesa;
	}
	
	public void cambiarNumCartasMano(int num){
		numCartMano = num;
	}
	
	public void cambiarNumCartasMesa(int num){
		numCartMesa = num;
	}
}
