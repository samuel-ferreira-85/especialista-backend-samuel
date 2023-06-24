package com.samuel.estruturadados.pilha;

public class PilhaTest {

    public static void main(String[] args) {

        Pilha<Integer> inteiros = new Pilha<>();

        inteiros.push(1);
        inteiros.push(2);
        inteiros.push(3);
        inteiros.push(4);

        System.out.println("A pilha está vazia? " + inteiros.isEmpty());

        System.out.println("O tamanho da pilha: " + inteiros.size());
        System.out.print("Os elementos da pilha: ");
        System.out.println(inteiros);
        System.out.println("Espiando o elemento no topo: " + inteiros.top());
        System.out.println("Desempilhando o elemento no topo: " + inteiros.pop());
        System.out.println(inteiros);

    }
}
