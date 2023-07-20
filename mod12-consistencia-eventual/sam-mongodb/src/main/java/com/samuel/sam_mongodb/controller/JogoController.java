package com.samuel.sam_mongodb.controller;

import com.samuel.sam_mongodb.model.Jogo;
import com.samuel.sam_mongodb.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/jogos")
public class JogoController {
    @Autowired
    private JogoService jogoService;

    @PostMapping
    public Jogo criaJogo(@RequestBody Jogo jogo) {
        return jogoService.criarJogo(jogo);
    }

    @GetMapping("/count")
    public Long contaJogos() {
        return jogoService.count();
    }
}
