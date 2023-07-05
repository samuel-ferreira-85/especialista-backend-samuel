package com.samuel.backtracking;

/*
    Dado um tabuleiro de tamanho NxN, devemos colocar N rainhas no tabuleiro de forma que nenhuma delas se ataquem.
    Exemplo n=4;
 */
/*
0 1 0 0
0 0 0 1
1 0 0 0
0 0 1 0
 */
public class NRainhas {

    private static boolean temAtaque(int x, int y, int[][] tab) {
//        Checando as linhas
        for (int j = 0; j < tab.length; j++) {
            if (tab[x][j] == 1) return true;
        }
//        Checando as colunas
        for (int i = 0; i < tab.length; i++) {
            if (tab[i][y] == 1) return true;
        }
//        Checando as diagonais
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                int indEsq = i + j;
                int indDir = i - j;

                if (indEsq == (x + y) && tab[i][j] == 1) return true;

                if (indDir == (x - y) && tab[i][j] == 1) return true;
            }
        }
        return false;
    }

    private static  void imprimeTabuleiro(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean resolveNRainhas(int[][] tab, int n) {
//        checa se todas as rainhas foram colocadas
        if (n == 0) return true;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (temAtaque(i, j, tab)) continue;
//                Colocando a rainha no tabuleiro
                tab[i][j] = 1;

                if (resolveNRainhas(tab, n-1)) return true;

//                Solução não foi encontrado, desfazendo a última mudança
                tab[i][j] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int n = 4;
        int[][] tab = new int[n][n];

        boolean resultado = resolveNRainhas(tab, n);
        if (resultado) imprimeTabuleiro(tab);
        else System.out.println("Não houve solução!");
    }

}
