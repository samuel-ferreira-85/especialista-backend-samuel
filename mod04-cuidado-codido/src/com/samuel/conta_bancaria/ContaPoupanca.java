package com.samuel.conta_bancaria;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(int saldo) {
        super(saldo);
    }

    public boolean temSaldoParaDebitar(int saldoDebitar) {
        if (saldo >= saldoDebitar) return true;
        return false;
    }
}
