package com.samuel.estruturadados.pilha;

import com.samuel.estruturadados.base.Base;

public class Pilha<T> extends Base<T> {

    public Pilha() {
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public boolean push(T elemento) {
        return super.adiciona(elemento);
    }

    public T pop() {
        if (this.isEmpty()) return null;

        return this.elementos[--size];
    }

    public T top() {
        if(this.isEmpty()) return null;

        return super.elementos[size - 1];
    }

}
