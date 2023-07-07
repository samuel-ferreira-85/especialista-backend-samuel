package com.samuel.exemplos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorSenhaTest {
    /*
    1 - adicionar um novo teste (esse teste tem que quebrar);
    2 - Executa o teste;
    3 - Refatorar (modificar) o código para fazer o código passar;
    4 - Executar o teste. Ele precisa passar.
     */

    @Test
    void testValidaSenha_HappyPath() {
//        pensamos que essa classe é utilitária, então não será necessária a sua instaciação
//        ValidadorSenha validador = new ValidadorSenha();
//        final boolean isValida = validador.validaSenha("12345678");

//        Refatoramos o método validaSenha para 'static'
        final boolean isValida = ValidadorSenha.validaSenha("12345678");

        assertTrue(isValida);
    }
}
