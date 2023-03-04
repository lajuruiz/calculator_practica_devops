package test;
import main.Calculator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class CalculatorTest {
        @Test
        void testMultiplicar() {
            int resultado = Calculator.multiplicar(2, 3);
            assertEquals(6, resultado, "2 x 3 debería ser igual a 6");
        }

        @Test
        void testDividir() {
        int resultado = Calculator.dividir(6, 3);
        assertEquals(2, resultado, "6 / 3 debería ser igual a 2");
    }

}


