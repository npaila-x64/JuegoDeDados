import java.util.ArrayList;
import java.util.List;

public class Calculadora {

	private final List<Integer> numeros;

	public Calculadora() {
		numeros = new ArrayList<>();
	}

	public int sumar() {
		int suma = 0;
		for (Integer numero : numeros) {
			suma += numero;
		}
		limpiarCalculadora();
		return suma;
	}

	public void agregarNumero(int numero) {
		numeros.add(numero);
	}

	private void limpiarCalculadora() {
		numeros.clear();
	}
}