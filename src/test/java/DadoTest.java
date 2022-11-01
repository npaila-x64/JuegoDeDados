import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DadoTest {

    @Test
    void verificarDadoTest() {
        Dado dado = new Dado();
        dado.lanzar();
        // Se verifica que el valor de cara esté en el rango [1,6]
        assertTrue(dado.obtenerValorCaraSuperior()/6.0 <= 1
                && dado.obtenerValorCaraSuperior() >= 1);
    }
}