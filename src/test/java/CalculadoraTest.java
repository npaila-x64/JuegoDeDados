import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void verificarSumaTest() {
        Calculadora calculadora = new Calculadora();
        calculadora.agregarNumero(1);
        calculadora.agregarNumero(1);
        assertEquals(2, calculadora.sumar());
    }
}