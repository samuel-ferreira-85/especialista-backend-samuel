package com.samuel.usuario_microservice.controllers;

import com.samuel.usuario_microservice.entities.Usuario;
import com.samuel.usuario_microservice.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public Iterable<Usuario> getAll() {
        return usuarioService.listarUsuarios();
    }

    @PostMapping
    public Usuario create(@RequestBody Usuario usuario) {
        return usuarioService.cadastrarUsuario(usuario);
    }
}
