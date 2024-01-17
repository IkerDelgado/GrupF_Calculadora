import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaTest {

    @Test
    void restaEquals() {
        int numero1 = 10;
        int numero2= 5;

        int resultado= 5;
        assertEquals(resultado,Calculadora.resta(numero1,numero2));
    }

    @Test
    void restaNotEquals() {
        int numero3 = 15;
        int numero4 = 6;

        int resultado = 1;
        assertNotEquals(resultado,Calculadora.resta(numero3,numero4));
    }

    @Test
    void restaNotNull() {
        int numero5 = 20;
        int numero6 = 20;

        assertNotNull(Calculadora.resta(numero5,numero6));
    }

    @Test

    void restaNegatiu() {
        int numero7 = -10;
        int numero8 = -10;
        int resultado = Calculadora.resta(10,10);
        assertEquals(resultado,Calculadora.resta(numero7,numero8));    }
}

