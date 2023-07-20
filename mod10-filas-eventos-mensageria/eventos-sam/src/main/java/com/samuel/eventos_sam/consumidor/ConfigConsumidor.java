package com.samuel.eventos_sam.consumidor;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;

@Configuration
public class ConfigConsumidor {

    @RetryableTopic(attempts = "2")
    @KafkaListener(topics = "${kafka.sam.nome.topico}", groupId = "samGroup")
    public void consumirMensagem(String mensagem) {
        if (mensagem.contains("DLT")) {
            throw new IllegalArgumentException("Teste de DLT");
        }

        System.out.println("=============== RECEBENDO MENSAGEM ===============");
        System.out.println("=============== " + mensagem);
        System.out.println("=============== FIM RECEBENDO MENSAGEM ===============");
    }

    @DltHandler
    public void consumirMensagemDlt(String mensagem) {
        System.out.println("=============== RECEBENDO MENSAGEM ===============");
        System.out.println("=============== " + mensagem);
        System.out.println("=============== FIM RECEBENDO MENSAGEM ===============");
    }
}
