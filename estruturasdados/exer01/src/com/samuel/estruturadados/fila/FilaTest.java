package com.samuel.estruturadados.fila;

public class FilaTest {

    public static void main(String[] args) {

        Fila<Integer> inteiros = new Fila<>();

        inteiros.enqueue(1);
        inteiros.enqueue(3);
        inteiros.enqueue(4);
        inteiros.enqueue(2);

        System.out.println("A fila está vazia? " + inteiros.isEmpty());
        System.out.println("Qual o tamanho da fila? " + inteiros.size());
        System.out.println("Qual o primeiro elemento da fila? " + inteiros.front());
        System.out.println("Qual o ultimo elemento da fila? " + inteiros.rear());

        System.out.println("Removendo um elemento da fila: " + inteiros.dequeue());

        System.out.println(inteiros);


    }
}
