package com.samuel.exercicios;

import com.samuel.exercicio.Calculadora;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculadoraTest {

    @Test
    void testAdicionar_HappyPath() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Calculadora calculadora = new Calculadora();
        Method adicionar = Calculadora.class.getDeclaredMethod("adicionar", int.class, int.class);
        adicionar.setAccessible(true); // Permite acesso ao método privado
        int resultado = (int) adicionar.invoke(calculadora, 5, 8);
        assertEquals(13, resultado);
    }

    @Test
    void testSubtrair_HappyPath() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Calculadora calculadora = new Calculadora();
        Method subtrair = Calculadora.class.getDeclaredMethod("subtrair", int.class, int.class);
        subtrair.setAccessible(true); // Permite acesso ao método privado
        int resultado = (int) subtrair.invoke(calculadora, 5, 8);
        assertEquals(-3, resultado);
    }

    @Test
    void testMultiplicar_HappyPath() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Calculadora calculadora = new Calculadora();
        Method multiplicar = Calculadora.class.getDeclaredMethod("multiplicar", int.class, int.class);
        multiplicar.setAccessible(true); // Permite acesso ao método privado
        int resultado = (int) multiplicar.invoke(calculadora, 5, 8);
        assertEquals(40, resultado);
    }

    @Test
    void testDividir_HappyPath() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Calculadora calculadora = new Calculadora();
        Method dividir = Calculadora.class.getDeclaredMethod("dividir", int.class, int.class);
        dividir.setAccessible(true); // Permite acesso ao método privado
        int resultado = (int) dividir.invoke(calculadora, 40, 8);
        assertEquals(5, resultado);
    }
    @Test
    void testDividir_ByZero() throws NoSuchMethodException {
        Calculadora calculadora = new Calculadora();
        Method dividir = Calculadora.class.getDeclaredMethod("dividir", int.class, int.class);
        dividir.setAccessible(true); // Permite acesso ao método privado
        assertThrows(ArithmeticException.class, () -> {
            try {
                dividir.invoke(calculadora, 40, 0);
            } catch (InvocationTargetException e) {
                throw e.getTargetException(); // Lança a exceção original
            }
        });
    }

}
