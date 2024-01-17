import static org.junit.jupiter.api.Assertions.*;

class DivisioTest {

    @org.junit.jupiter.api.Test
    void  divisioCorrecta(){
        int num1 = 10;
        int num2 = 2;
        int res = 5;
        assertEquals(res,Calculadora.divisio(num1,num2));
    }
    @org.junit.jupiter.api.Test
    void  divisioIncorrecte(){
        int num1 = 10;
        int num2 = 5;
        int res = 5;
        assertNotEquals(res,Calculadora.divisio(num1,num2));
    }
    @org.junit.jupiter.api.Test
    void  divisioAmbReultatObligatori() {
        int num1 = 10;
        int num2 = 5;
        assertNotNull(Calculadora.divisio(num1, num2));
    }
    @org.junit.jupiter.api.Test
    void  divisioNegativaCorrecta(){
        int num1 = -10;
        int num2 = -2;
        int res = 5;
        assertEquals(res,Calculadora.divisio(num1,num2));
    }
}