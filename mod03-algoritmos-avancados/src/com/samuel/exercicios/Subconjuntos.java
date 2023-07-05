package com.samuel.exercicios;

/*
Dado um conjunto S de elementos únicos, calcule todos os seus subconjuntos de n elementos.
Exemplos:

Entrada: S = [1, 2, 3], n = 2
Saída: [1, 2], [1, 3], [2, 3]

Entrada: S= [1, 2, 3, 4], n = 1
Saída: [1], [2], [3] e [4]
 */
import java.util.ArrayList;
import java.util.List;

public class Subconjuntos {

    public static List<List<Integer>> encontrarSubconjuntos(int[] arrayInt, int n) {
        List<List<Integer>> subconjuntos = new ArrayList<>();
        backtrack(arrayInt, n, 0, new ArrayList<>(), subconjuntos);
        return subconjuntos;
    }

    private static void backtrack(int[] subconjunto, int n, int inicio, List<Integer> subconjuntoAtual,
                                  List<List<Integer>> subconjuntos) {

        if (subconjuntoAtual.size() == n) {
            subconjuntos.add(new ArrayList<>(subconjuntoAtual));
            return;
        }

        for (int i = inicio; i < subconjunto.length; i++) {
            subconjuntoAtual.add(subconjunto[i]);
            backtrack(subconjunto, n, i + 1, subconjuntoAtual, subconjuntos);
            subconjuntoAtual.remove(subconjuntoAtual.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arrayInt1 = {1, 2, 3};
        int n1 = 2;
        List<List<Integer>> subconjuntos1 = encontrarSubconjuntos(arrayInt1, n1);
        System.out.println("Quantidade de subconjuntos: " + subconjuntos1.size());
        System.out.println(subconjuntos1);

        int[] arrayInt2 = {1, 2, 3, 4, 5};
        int n2 = 3;
        List<List<Integer>> subconjuntos2 = encontrarSubconjuntos(arrayInt2, n2);
        System.out.println("Quantidade de subconjuntos: " + subconjuntos2.size());
        System.out.println(subconjuntos2);
    }

}


