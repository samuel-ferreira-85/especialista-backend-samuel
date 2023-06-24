package com.samuel.estruturadados.fila;

import com.samuel.estruturadados.base.Base;

public class Fila<T> extends Base<T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public boolean enqueue(T elemento) {
        return super.adiciona(elemento);
    }

    public T dequeue() {
        if (this.isEmpty()) return null;

        T elemento = elementos[0];
        super.remover(0);
        return elemento;
    }

    public T front() {
        if (this.isEmpty()) return null;
        return super.elementos[0];
    }

    public T rear() {
        if (this.isEmpty()) return null;
        return super.elementos[super.size() - 1];
    }
}
