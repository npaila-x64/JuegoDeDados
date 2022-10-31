import java.util.Random;

public class Dado {
	private Integer valorCaraSuperior;

	public Dado() {
		// Por defecto se tiene que el valor inicial
		// de la cara superior de cada dado creado es 1
		this.valorCaraSuperior = 1;
	}

	public int obtenerValorCaraSuperior() {
		return valorCaraSuperior;
	}

	public void lanzar() {
		calcularValorAleatorio();
	}

	private void calcularValorAleatorio() {
		valorCaraSuperior = ((int)(Math.random()*10))%6 + 1;
	}
}