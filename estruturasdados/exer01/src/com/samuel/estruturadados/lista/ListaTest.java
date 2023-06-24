package com.samuel.estruturadados.lista;

public class ListaTest {

    public static void main(String[] args) {
        Lista<Integer> inteiros = new Lista<>();

        inteiros.push(1);
        inteiros.push(2);
        inteiros.push(3);
        inteiros.push(4);

        System.out.println("O tamanho da lista: " + inteiros.size());

        System.out.println(inteiros.printList());

        inteiros.insert(3, new Node<>(5));
        System.out.println(inteiros.printList());

        System.out.println(inteiros.elementAt(4).getElemento());
        System.out.println(inteiros.printList());

        System.out.println("Removendo o elemento: " + inteiros.pop().getElemento());

        System.out.println("O tamanho da lista: " + inteiros.size());

        System.out.println("O elemento no indice 2: " + inteiros.elementAt(2).getElemento());

        System.out.println("Removendo o elemento no indice 2: ");
        inteiros.remove(2);
        System.out.println(inteiros.printList());

       inteiros.clear();
        System.out.println("O tamanho da lista: " + inteiros.size());

    }
}
