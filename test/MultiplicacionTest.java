import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class MultiplicacionTest {

    @org.junit.jupiter.api.Test
    void multiplicacion() {
        int operador1 = 7;
        int operador2 = 3;
        int resultat = 21;
        assertEquals(resultat, Calculadora.multiplicacion(operador1, operador2));
    }

    @org.junit.jupiter.api.Test
    void multiplicacionNegativo() {
        int operador1 = -7;
        int operador2 = 3;
        int resultat = -21;
        assertEquals(resultat, Calculadora.multiplicacion(operador1, operador2));
    }

    @org.junit.jupiter.api.Test
    void multiplicacionNegativo2() {
        int operador1 = -7;
        int operador2 = -3;
        int resultat = 21;
        assertEquals(resultat, Calculadora.multiplicacion(operador1, operador2));
    }

}
