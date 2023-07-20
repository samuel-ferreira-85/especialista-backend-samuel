package com.samuel.usuario_microservice.repositories;

import com.samuel.usuario_microservice.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioRepository extends CrudRepository<Usuario, String> {

}
