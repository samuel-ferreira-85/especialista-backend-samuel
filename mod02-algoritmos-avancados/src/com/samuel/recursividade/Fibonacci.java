package com.samuel.recursividade;

public class Fibonacci {
    private static void imprimeFibonacci(int n) {
        System.out.print("A posição " + n + " na sequência Fibonacci é " + fibonacci(n));
    }

    private static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 2;
        imprimeFibonacci(n);
    }
}
