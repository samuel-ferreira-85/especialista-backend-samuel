package com.samuel.sam_mongodb.controller;

import com.samuel.sam_mongodb.model.Jogo;
import com.samuel.sam_mongodb.service.JogoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    private JogoService jogoService;

    public JogoController(JogoService jogoService) {
        this.jogoService = jogoService;
    }

    @PostMapping
    public Jogo criaJogo(@RequestBody Jogo jogo) {
        return jogoService.criarJogo(jogo);
    }
}
