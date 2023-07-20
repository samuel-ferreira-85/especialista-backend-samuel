package com.samuel.sam_toggle_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/mensagens")
public class MessageController {

    @Value("${client.message:Oi, não tenho mensagem!}")
    private String message;

    @Value("${cliente.lisgadesliga:false}")
    private boolean ligaDesliga;

    @GetMapping
    public String getMessage() {
        if (ligaDesliga) return this.message;
        return "Funcionalidade desligada.";
    }
}
