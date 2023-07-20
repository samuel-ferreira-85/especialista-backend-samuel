package com.samuel.sam_mongodb.service;

import com.samuel.sam_mongodb.model.Jogo;
import com.samuel.sam_mongodb.repository.IJogoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

@Component
@EnableMongoRepositories(basePackageClasses = IJogoRepository.class)
public class JogoService {

    private IJogoRepository jogoRepository;

    public JogoService(IJogoRepository IJogoRepository) {
        this.jogoRepository = IJogoRepository;
    }

    public Jogo criarJogo(Jogo jogo) {
        return jogoRepository.insert(jogo);
    }
}
