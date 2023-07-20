package com.samuel.jogo_sam.repositories;

import com.samuel.jogo_sam.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioRepository extends CrudRepository<Usuario, Long> {
}
