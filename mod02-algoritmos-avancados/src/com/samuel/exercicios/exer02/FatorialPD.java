package com.samuel.exercicios.exer02;

public class FatorialPD {
    private static final int MAX_ELEMENTOS = 100;
    private static final long[] elementosFat = new long[MAX_ELEMENTOS];

    private static long fatorialPD(int n) {
        for (int i = 0; i < MAX_ELEMENTOS; i++) elementosFat[i] = -1;
        return fatorial(n);
    }

    private static long fatorial(int n) {
        if (elementosFat[n] == -1) {
            if (n <= 1) elementosFat[n] = n;
            else {
                elementosFat[n] = n * fatorial(n -1);
            }
        }
        return elementosFat[n];
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("O fatorial de " + n + " é igual a " + fatorialPD(n));
        n = 7;
        System.out.println("O fatorial de " + n + " é igual a " + fatorialPD(n));
    }
}
