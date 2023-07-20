package com.samuel.jogo_sam.controllers;

import com.samuel.jogo_sam.entities.Jogo;
import com.samuel.jogo_sam.services.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    @Autowired
    private JogoService jogoService;

    @GetMapping
    public Iterable<Jogo> encontrarTodos() {
        return jogoService.encontrarTodos();
    }
}
