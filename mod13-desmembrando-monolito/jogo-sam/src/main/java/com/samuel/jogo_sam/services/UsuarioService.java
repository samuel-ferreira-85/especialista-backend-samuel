package com.samuel.jogo_sam.services;

import com.samuel.jogo_sam.dto.UsuarioDTO;
import com.samuel.jogo_sam.entities.Usuario;
import com.samuel.jogo_sam.repositories.IUsuarioRepository;
import com.samuel.jogo_sam.utils.UsuarioUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    public Iterable<UsuarioDTO> encontrarTodos() {
        final Iterable<Usuario> usuarioIterable = usuarioRepository.findAll();
        return UsuarioUtils.usuarioParaUsuarioDTO(usuarioIterable);
    }

    public UsuarioDTO criarUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuarioSalvo = UsuarioUtils.usuarioDTOparaUsuario(usuarioDTO);
        usuarioSalvo = usuarioRepository.save(usuarioSalvo);

        return UsuarioUtils.usuarioParaUsuarioDTO(usuarioSalvo);
    }
}
