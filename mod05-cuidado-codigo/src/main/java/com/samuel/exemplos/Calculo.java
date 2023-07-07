package com.samuel.exemplos;

public class Calculo {

    public int calcularMDC(int n1, int n2) {

        if (n2 == 0) {
            return n1;
        } else {
            return calcularMDC(n2, n1 % n2);
        }
    }

    public int somarNumeros(int a, int b) {
        return a + b;
    }
}
