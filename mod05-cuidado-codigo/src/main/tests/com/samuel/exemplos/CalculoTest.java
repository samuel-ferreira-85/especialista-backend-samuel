package com.samuel.exemplos;

import com.samuel.exemplos.Calculo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculoTest {

    @Test
    void testConstructor() {
        final Calculo calculo = new Calculo();
        assertNotNull(calculo);
    }

    @Test
    void testSomarNumeros_HappyPath() {
        final Calculo calculo = new Calculo();
        final int soma = calculo.somarNumeros(10 ,10);

        assertEquals(20, soma);
    }

    @Test
    void testCalcularMDC_HappyPath() {
        final Calculo calculo = new Calculo();
        final int mdc = calculo.calcularMDC(8, 4);

        assertEquals(4, mdc);
    }

    @Test
    void testCalcularMDC_N1IsZero() {
        final Calculo calculo = new Calculo();
        final int mdc = calculo.calcularMDC(0, 5);

        assertEquals(5, mdc);
    }

    @Test
    void testCalcularMDC_N2IsZero() {
        final Calculo calculo = new Calculo();
        final int mdc = calculo.calcularMDC(5, 0);

        assertEquals(5, mdc);
    }
}
