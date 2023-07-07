package com.samuel.conta_bancaria;

public class ContaCorrente extends ContaBancaria{

    private int limite;

    public ContaCorrente(int saldo, int limite) {
        super(saldo);
        this.limite = limite;
    }

    public boolean temSaldoParaDebitar(int saldoDebitar) {
        if (saldo + limite >= saldoDebitar) return true;
        return false;
    }
}
