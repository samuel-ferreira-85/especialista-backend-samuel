package com.samuel.exercicio;

public class Fibonacci {
    private static void imprimeFibonacci(int n) {
        System.out.printf("A posição %d na sequência Fibonacci é %d", n, fibonacci(n));
    }

    public static int fibonacci(int n) {
        Integer n1 = valido(n);
        if (n1 != null) return n1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private static Integer valido(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser maior ou igual a 0.");
        } else if (n <= 1) {
            return n;
        }
        return null;
    }

    public static void main(String[] args) {
        int n = -1;
        imprimeFibonacci(n);
    }
}
