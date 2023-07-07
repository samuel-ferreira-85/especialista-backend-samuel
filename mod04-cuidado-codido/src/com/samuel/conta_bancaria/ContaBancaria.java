package com.samuel.conta_bancaria;

// Para melhorar a complexidade, vamos transforma ContaBancaria em uma classe abstrata
public abstract class ContaBancaria {

    protected  int saldo;

    public ContaBancaria(int saldo) {
        this.saldo = saldo;
    }

//    cria um método que as subclasses devem implementar
    public abstract boolean temSaldoParaDebitar(int saldoDebitar);
}
