package com.samuel.exemplos;

public class ValidadorSenha {
    public static boolean validaSenha(String senha) {
        return senha != null && senha.length() >= 8;
    }
}
