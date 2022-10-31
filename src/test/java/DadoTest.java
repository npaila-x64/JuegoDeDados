import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DadoTest {

    @Test
    void verificarTest() {
        Dado dado = new Dado();
        dado.lanzar();
        assertEquals(2, dado.obtenerValorCaraSuperior());
    }
}