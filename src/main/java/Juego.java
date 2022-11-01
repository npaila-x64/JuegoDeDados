import java.util.ArrayList;
import java.util.List;

public class Juego {
	private ArrayList<Dado> dados = new ArrayList<Dado>();

	public Juego() {
		this.dados = new ArrayList<>();
		dados.add(new Dado());
		dados.add(new Dado());
	}

	public void lanzarDados() {
		dados.forEach(Dado::lanzar);
	}

	private int sumarCaras() {
		Calculadora calculadora = new Calculadora();
		dados.stream()
				.mapToInt(Dado::obtenerValorCaraSuperior)
				.forEach(calculadora::agregarNumero);
		return calculadora.sumar();
	}

	public List<Dado> obtenerDados() {
		return new ArrayList<>(dados);
	}

	public boolean esGanador() {
		return sumarCaras() == 7;
	}

	public void mostrarGanador() {
		System.out.println(esGanador() ? "ganaste!!!" : "has perdido!!!");
	}

	public void mostrarDados() {
		System.out.println("Tus caras son");
		for (Dado dado : dados) {
			System.out.println(dado.obtenerValorCaraSuperior());
		}
	}
}