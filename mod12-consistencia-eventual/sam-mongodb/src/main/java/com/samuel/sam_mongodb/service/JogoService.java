package com.samuel.sam_mongodb.service;

import com.samuel.sam_mongodb.model.Jogo;
import com.samuel.sam_mongodb.repository.IJogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

@Component
@EnableMongoRepositories(basePackageClasses = IJogoRepository.class)
public class JogoService {

    @Autowired
    private IJogoRepository jogoRepository;

    public Jogo criarJogo(Jogo jogo) {
        return jogoRepository.insert(jogo);
    }

    public long count() {
        return jogoRepository.count();
    }
}
