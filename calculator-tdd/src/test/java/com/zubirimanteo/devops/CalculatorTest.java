package com.zubirimanteo.devops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    @Test
    void sumaTest() {
        // 1. Preparación (Arrange)
        Calculator calc = new Calculator();
        // 2. Ejecución (Act)
        int resultado = calc.suma(2, 2);
        // 3. Verificación (Assert)
        assertEquals(5, resultado, "La suma 2 + 3 debería ser 5");
    }

    @Test 
    void restTest() {

        Calculator calc = new Calculator();
        int result = calc.rest(10,4);
        assertEquals(6, result, "The rest of 10 - 4 should be 6");
    }

    @Test 
    void multTest() {
        Calculator calc = new Calculator();
        int result = calc.mult(5,5);
        assertEquals(25, result, "The mult of 5 * 5 should be 25");
    }
}