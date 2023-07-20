package com.samuel.jogo_sam.services;

import com.samuel.jogo_sam.entities.Jogo;
import com.samuel.jogo_sam.repositories.IJogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JogoService {

    @Autowired
    private IJogoRepository jogoRepository;

    public Iterable<Jogo> encontrarTodos() {
        return jogoRepository.findAll();
    }
}
