package com.samuel.jogo_sam.repositories;

import com.samuel.jogo_sam.entities.Jogo;
import org.springframework.data.repository.CrudRepository;

public interface IJogoRepository extends CrudRepository<Jogo, Long> {
}
