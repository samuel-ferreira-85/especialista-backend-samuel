package com.samuel.jogo_sam.controllers;

import com.samuel.jogo_sam.dto.UsuarioDTO;
import com.samuel.jogo_sam.services.NovoUsuarioService;
import com.samuel.jogo_sam.services.UsuarioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

//    private final UsuarioService usuarioService;
    private final NovoUsuarioService novoUsuarioService;

    public UsuarioController(/*UsuarioService usuarioService, */NovoUsuarioService novoUsuarioService) {
//        this.usuarioService = usuarioService;
        this.novoUsuarioService = novoUsuarioService;
    }

    @GetMapping
    public Iterable<UsuarioDTO> encontrarTodos() {
        return novoUsuarioService.encontrarTodos();
    }

    @PostMapping
    public UsuarioDTO criar(@RequestBody UsuarioDTO usuario) {
        return novoUsuarioService.criarNovoUsuario(usuario);

//        UsuarioDTO novoUsuarioDTOCriado = novoUsuarioService.criarNovoUsuario(usuario);
//        novoUsuarioService.criarUsuario(usuario);

//        return novoUsuarioDTOCriado;
    }
}
