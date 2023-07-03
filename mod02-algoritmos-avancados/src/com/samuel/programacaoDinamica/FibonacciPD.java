package com.samuel.programacaoDinamica;

//    Fibonacci com programação dinâmica
public class FibonacciPD {
    private static final int MAX_ELEMENTOS = 100;
    private static final long[] elementosFib = new long[MAX_ELEMENTOS];

    public static long encontrarElementosPD(int n) {
        for (int i = 0; i < MAX_ELEMENTOS; i++) elementosFib[i] = -1;
        return encontrarElemento(n);
    }

    public static long encontrarElemento(int n) {
        if (elementosFib[n] == -1) {
            if (n <= 1) elementosFib[n] = n;
            else elementosFib[n] = (encontrarElemento(n - 1) + encontrarElemento(n - 2));
        }
        return elementosFib[n];
    }

    public static void main(String[] args) {
        int n = 50;
        System.out.println("Elemento " + n + ": " + encontrarElementosPD(n));
    }
}
