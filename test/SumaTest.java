import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumaTest {

    @org.junit.jupiter.api.Test
    void  sumaTest(){
        int a = 2;
        int b = 3;
        int res = 5;
        assertEquals(res,Calculadora.suma(a,b));
    }
}