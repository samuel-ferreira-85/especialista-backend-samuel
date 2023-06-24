package com.samuel.estruturadados.lista;

public class Lista<T> {

    private Node<T> inicio;
    private Node<T> ultimo;
    private int size = 0;

    public void push(T elemento) {
        Node<T> valor = new Node<>(elemento);
        if (size == 0) {
            inicio = valor;
        }
        else {
            ultimo.setProximo(valor);
        }
        ultimo = valor;
        size++;
    }

    public void insert(int index, Node<T> valor) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        if (index == 0) {
            valor.setProximo(inicio);
            inicio = valor;
        } else {
            Node<T> atual = inicio;
            for (int i = 0; i < index - 1; i++) {
                atual = atual.getProximo();
            }
            valor.setProximo(atual.getProximo());
            atual.setProximo(valor);
            size++;
        }
    }

    public Node<T> pop(){
        if (inicio == null) {
            return null;
        }

        if (inicio.getProximo() == null) {
            Node<T> noRemovido = inicio;
            inicio = null;
            return noRemovido;
        }

        Node<T> atual = inicio;
        while (atual.getProximo().getProximo() != null) {
            atual = atual.getProximo();
        }
        Node<T> noRemovido = atual.getProximo();
        atual.setProximo(null);
        size--;
        return noRemovido;
    }

    public void remove(T valor) {
        Node<T> anterior = null;
        Node<T> atual = inicio;

        for (int i = 0; i < this.size(); i++) {
            if (atual.getElemento().equals(valor)) {
                if (size == 1) {
                    inicio = null;
                    ultimo = null;
                } else if(atual == inicio) {
                    inicio = atual.getProximo();
                    atual.setProximo(null);
                } else if(atual == ultimo) {
                    ultimo = anterior;
                    anterior.setProximo(null);
                } else {
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                size--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

    public void remove(int index) {
        Node<T> elemento = elementAt(index);
        remove(elemento.getElemento());
    }

    public Node<T> elementAt(int posicao) {
        Node<T> atual = inicio;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual;
    }

    public void clear() {
        for (Node<T> atual = inicio; atual != null;) {
            Node<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }
        inicio = null;
        ultimo = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public String printList() {
        if (size == 0) return "[]";

        StringBuilder sb = new StringBuilder("[");
        Node<T> atual = inicio;

        for (int i = 0; i < size - 1; i++) {
            sb.append(atual.getElemento()).append(",");
            atual = atual.getProximo();
        }

        sb.append(atual.getElemento()).append("]");
        return sb.toString();
    }
}
