import static org.junit.jupiter.api.Assertions.*;

class SumaTest {

    @org.junit.jupiter.api.Test
    void  sumaTestPositiu(){
        int a = 2;
        int b = 3;
        int res = 5;
        assertEquals(res,Calculadora.suma(a,b));
    }

    @org.junit.jupiter.api.Test
    void  sumaTestNegatiu(){
        int a = -2;
        int b = -3;
        int res = -5;
        assertEquals(res,Calculadora.suma(a,b));
    }

    @org.junit.jupiter.api.Test
    void  sumaTestMalament(){
        int a = 2;
        int b = 2;
        int res = 3;
        assertNotEquals(res,Calculadora.suma(a,b));
    }
    @org.junit.jupiter.api.Test
    void  sumaTestNegatiuMalament(){
        int a = -2;
        int b = -2;
        int res = 3;
        assertNotEquals(res,Calculadora.suma(a,b));
    }
}