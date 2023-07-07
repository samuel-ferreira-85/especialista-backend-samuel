package com.samuel;

public class ComplexidadeCiclomatica {

    public static int fazAlgo(int a, int b, int c) {

        if (ePar(a)) return somar(b, c);

        if (ePar(b))  return somar(a, c);

        if (ePar(c)) return somar(a, b);

        return -1;
    }

    private static boolean ePar(int num) {
        return num % 2 == 0;
    }

    private static int somar(int a, int b) {
        return a + b;
    }
}
