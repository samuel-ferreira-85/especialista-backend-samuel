package com.samuel.exercicios;

/*
Você tem que dar o troco de uma quantia em dinheiro usando o menor número possível de moedas.
Exemplos:

Entrada: Quantia 18, Moedas disponíveis 5, 2 e 1
Saída: 5 (três moedas de 5, uma de 2 e uma de 1)
 */

import java.util.ArrayList;
import java.util.List;

public class Troco {

   public static List<Integer> darTroco(int quantia, int[] cedulas) {
        List<Integer> troco = new ArrayList<>();
        int i = 0;
        while (quantia > 0 && i < cedulas.length) {
            if (cedulas[i] <= quantia) {
                troco.add(cedulas[i]);
                quantia -= cedulas[i];
            } else {
                i++;
            }
        }
        return troco;
    }

    public static void main(String[] args) {
        int quantia = 58;
        int[] cedulas = {10, 5, 2, 1};
        List<Integer> resultado = darTroco(quantia, cedulas);
        System.out.println(resultado);
    }
}

