package com.samuel.jogo_sam.services;

import com.samuel.jogo_sam.dto.NovoUsuarioDTO;
import com.samuel.jogo_sam.dto.UsuarioDTO;
import com.samuel.jogo_sam.feign.IClienteFeignNovoUsuario;
import com.samuel.jogo_sam.utils.UsuarioUtils;
import org.springframework.stereotype.Service;

@Service
public class NovoUsuarioService {

    private final IClienteFeignNovoUsuario clienteFeignNovoUsuario;

    public NovoUsuarioService(IClienteFeignNovoUsuario clienteFeignNovoUsuario) {
        this.clienteFeignNovoUsuario = clienteFeignNovoUsuario;
    }

    public UsuarioDTO criarNovoUsuario(UsuarioDTO usuarioDTO) {
        NovoUsuarioDTO novoUsuarioDTO = UsuarioUtils.usuarioDTOparaNovoUsuarioDTO(usuarioDTO);
        novoUsuarioDTO = clienteFeignNovoUsuario.criarNovoUsuario(novoUsuarioDTO);

        return UsuarioUtils.novoUsuarioDTOparaUsuarioDTO(novoUsuarioDTO);
    }
}
