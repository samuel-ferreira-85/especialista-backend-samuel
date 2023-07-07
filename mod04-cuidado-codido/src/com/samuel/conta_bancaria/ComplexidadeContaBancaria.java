package com.samuel.conta_bancaria;

public class ComplexidadeContaBancaria {

    public static boolean checarSeTemSaldo(ContaBancaria conta, int saldo) {
//        Diminuimos a complexidade para 3, por conta do polimorfismo
        return conta.temSaldoParaDebitar(saldo);
//        if (conta instanceof ContaCorrente) return ((ContaCorrente) conta).temSaldoParaDebitar(saldo);
//
//        if (conta instanceof ContaPoupanca) return ((ContaPoupanca) conta).temSaldoParaDebitar(saldo);
//
//        return false;
    }
}
