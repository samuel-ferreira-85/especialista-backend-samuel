package com.samuel.exercicios.exer01;

public class FatorialRecursivo {

    private static int fatorial(int n) {
        if (n <= 1) return 1;
        return n * fatorial(n -1);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("O fatorial de " + n + " é igual a " + fatorial(n));
        n = 7;
        System.out.println("O fatorial de " + n + " é igual a " + fatorial(n));
    }
}
