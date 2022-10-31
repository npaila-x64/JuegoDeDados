import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JuegoTest {

    Juego juego;

    @BeforeEach
    void init() {
        juego = new Juego();
    }

    @Test
    void verificaDadosSonLanzadosTest() {
        var dados = juego.obtenerDados();
        var a1 = dados.get(0).obtenerValorCaraSuperior();
        var a2 = dados.get(1).obtenerValorCaraSuperior();
        juego.lanzarDados();
        var b1 = dados.get(0).obtenerValorCaraSuperior();
        var b2 = dados.get(1).obtenerValorCaraSuperior();
        assertNotEquals((a1 == b1)&&(a2 == b2),(a1 != b1)&&(a2 != b2));
    }

    @Test
    void verificarNoEsGanadorTest() {
        assertFalse(juego.esGanador());
    }
}