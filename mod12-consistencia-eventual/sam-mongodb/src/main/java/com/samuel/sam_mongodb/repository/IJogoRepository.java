package com.samuel.sam_mongodb.repository;

import com.samuel.sam_mongodb.model.Jogo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IJogoRepository extends MongoRepository<Jogo, String> {
    long count();
}
