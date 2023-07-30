package com.samuel.jogo_sam.utils;

import com.samuel.jogo_sam.dto.NovoUsuarioDTO;
import com.samuel.jogo_sam.dto.UsuarioDTO;
import com.samuel.jogo_sam.entities.Usuario;

import java.util.ArrayList;
import java.util.List;

public final class UsuarioUtils {
    private UsuarioUtils(){}

    public static Usuario usuarioDTOparaUsuario(UsuarioDTO usuarioDTO) {
        return new Usuario(usuarioDTO.getId(), usuarioDTO.getNome(), usuarioDTO.getLogin(), usuarioDTO.getIdade());
    }

    public static UsuarioDTO usuarioParaUsuarioDTO(Usuario usuario) {
        return new UsuarioDTO(usuario.getId(), usuario.getNome(), usuario.getLogin(), usuario.getIdade());
    }

    public static Iterable<UsuarioDTO> usuarioParaUsuarioDTO(Iterable<Usuario> usuarios) {
        List<UsuarioDTO> usuarioDTOList = new ArrayList<>();

        for (Usuario usuario : usuarios) {
            usuarioDTOList.add(new UsuarioDTO(usuario.getId(), usuario.getNome(), usuario.getLogin(), usuario.getIdade()));
        }
        return usuarioDTOList;
    }

    public static UsuarioDTO novoUsuarioDTOparaUsuarioDTO(NovoUsuarioDTO novoUsuarioDTO) {
        UsuarioDTO usuarioDTO = new UsuarioDTO(null, novoUsuarioDTO.getNome(), novoUsuarioDTO.getLogin(), novoUsuarioDTO.getIdade());
        usuarioDTO.setIdNovoUsuario(novoUsuarioDTO.getId());
        usuarioDTO.setAlturaCm(novoUsuarioDTO.getAlturaCm());

        return usuarioDTO;
    }

    public static NovoUsuarioDTO usuarioDTOparaNovoUsuarioDTO(UsuarioDTO usuarioDTO) {
        NovoUsuarioDTO novoUsuarioDTO = new NovoUsuarioDTO(null, usuarioDTO.getNome(), usuarioDTO.getLogin(), usuarioDTO.getIdade());
        novoUsuarioDTO.setAlturaCm(usuarioDTO.getAlturaCm());

        return novoUsuarioDTO;
    }
}
