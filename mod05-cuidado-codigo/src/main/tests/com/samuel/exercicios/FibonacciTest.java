package com.samuel.exercicios;

import com.samuel.exercicio.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FibonacciTest {

    @Test
    void testFibonacci_HappyPath() {
        int resultado = Fibonacci.fibonacci(6);
        assertEquals(8, resultado);
    }

    @Test
    void testFibonacci_NumOne() {
        int resultado = Fibonacci.fibonacci(1);
        assertEquals(1, resultado);
    }

    @Test
    void testFibonacci_NumZero() {
        int resultado = Fibonacci.fibonacci(0);
        assertEquals(0, resultado);
    }

    @Test
    void testFibonacci_NumNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            Fibonacci.fibonacci(-1);
        });
    }


}
