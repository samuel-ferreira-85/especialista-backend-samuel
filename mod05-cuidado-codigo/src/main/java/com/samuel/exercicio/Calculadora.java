package com.samuel.exercicio;

/**
 * A classe Calculadora realiza operações matemáticas básicas, como adição, subtração,
 * multiplicação e divisão.
 * @version 1.0
 * @since 2023-07-06
 * @author samuel
 */
public class Calculadora {
    /**
     * Realiza a adição de dois números inteiros.
     *
     * @param n1 O primeiro número inteiro a ser adicionado.
     * @param n2 O segundo número inteiro a ser adicionado.
     * @return A soma dos dois números inteiros.
     */
    private static int adicionar(int n1, int n2) {
        return n1 + n2;
    }

    /**
     * Realiza a subtração de dois números inteiros.
     *
     * @param n1 O número inteiro a ser subtraído.
     * @param n2 O número inteiro a ser subtraído do primeiro número.
     * @return A diferença entre os dois números inteiros.
     */
    private static int subtrair(int n1, int n2) {
        return n1 - n2;
    }

    /**
     * Realiza a multiplicação de dois números inteiros.
     *
     * @param n1 O primeiro número inteiro a ser multiplicado.
     * @param n2 O segundo número inteiro a ser multiplicado.
     * @return O produto dos dois números inteiros.
     */
    private static int multiplicar(int n1, int n2) {
        return n1 * n2;
    }

    /**
     * Realiza a divisão de dois números inteiros.
     *
     * @param n1 O número inteiro a ser dividido.
     * @param n2 O número inteiro pelo qual o primeiro número será dividido.
     * @return O resultado da divisão dos dois números inteiros.
     * @throws ArithmeticException Se o segundo número(n2) for zero, uma exceção será lançada.
     */
    private static int dividir(int n1, int n2) throws ArithmeticException {
        if (n2 == 0) {
            throw new ArithmeticException();
        }
        return n1 / n2;
    }

}
