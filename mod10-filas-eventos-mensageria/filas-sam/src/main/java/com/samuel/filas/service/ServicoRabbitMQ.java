package com.samuel.filas.service;

import com.samuel.filas.configuracao.ConfiguracaoRabbitMQ;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoRabbitMQ {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void enviaMenssagem(String mensagem) {
        rabbitTemplate.convertAndSend(ConfiguracaoRabbitMQ.NOME_EXCHANGE, "sam.rota.mensagem", mensagem);
    }
}
