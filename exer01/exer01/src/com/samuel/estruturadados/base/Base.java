package com.samuel.estruturadados.base;

public class Base<T> {

    protected T[] elementos;
    protected int size;

    public Base(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.size = 0;
    }

    public Base(){
        this(10);
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    protected boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.size < this.elementos.length){
            this.elementos[this.size] = elemento;
            this.size++;
            return true;
        }
        return false;
    }

    protected boolean adiciona(int posicao, T elemento){

        if (posicao < 0 || posicao > size){
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        //move todos os elementos
        for (int i=this.size-1; i>=posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.size++;

        return true;
    }

    protected void remover(int posicao){
        if (!(posicao >= 0 && posicao < size)){
            throw new IllegalArgumentException("Posicao inválida");
        }
        for (int i = posicao; i < size - 1; i++){
            elementos[i] = elementos[i+1];
        }
        this.size--;
    }

    private void aumentaCapacidade(){
        if (this.size == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i=0; i<this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public int size(){
        return this.size;
    }


    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i=0; i<this.size-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.size>0){
            s.append(this.elementos[this.size-1]);
        }

        s.append("]");

        return s.toString();
    }
}
