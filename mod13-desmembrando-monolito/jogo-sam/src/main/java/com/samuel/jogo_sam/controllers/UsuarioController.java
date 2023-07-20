package com.samuel.jogo_sam.controllers;

import com.samuel.jogo_sam.dto.UsuarioDTO;
import com.samuel.jogo_sam.entities.Usuario;
import com.samuel.jogo_sam.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public Iterable<UsuarioDTO> encontrarTodos() {
        return usuarioService.encontrarTodos();
    }

    @PostMapping
    public UsuarioDTO criar(@RequestBody UsuarioDTO usuario) {
        return usuarioService.criarUsuario(usuario);
    }
}
