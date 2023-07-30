package com.samuel.jogo_sam.services;

import com.samuel.jogo_sam.dto.NovoUsuarioDTO;
import com.samuel.jogo_sam.dto.UsuarioDTO;
import com.samuel.jogo_sam.feign.IClienteFeignNovoUsuario;
import com.samuel.jogo_sam.utils.UsuarioUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NovoUsuarioService {

    private final IClienteFeignNovoUsuario clienteFeignNovoUsuario;

    public NovoUsuarioService(IClienteFeignNovoUsuario clienteFeignNovoUsuario) {
        this.clienteFeignNovoUsuario = clienteFeignNovoUsuario;
    }

    public UsuarioDTO criarNovoUsuario(UsuarioDTO usuarioDTO) {
//        Converte usuarioDTO para novoUsuarioDTO
        NovoUsuarioDTO novoUsuarioDTO = UsuarioUtils.usuarioDTOparaNovoUsuarioDTO(usuarioDTO);
//        Cria um novoUsuarioDTO com o feign com as especificações fornecidas do outro serviço
        novoUsuarioDTO = clienteFeignNovoUsuario.criarNovoUsuario(novoUsuarioDTO);
//        Converte o novoUsuarioDTO para usuarioDTO e retorna no método
        return UsuarioUtils.novoUsuarioDTOparaUsuarioDTO(novoUsuarioDTO);
    }

    public Iterable<UsuarioDTO> encontrarTodos() {
        List<NovoUsuarioDTO> novoUsuarioDTOList = clienteFeignNovoUsuario.encontrarTodos();

        List<UsuarioDTO> usuarioDTOList = new ArrayList<>();

        for (NovoUsuarioDTO novoUsuarioDTO : novoUsuarioDTOList) {
            usuarioDTOList.add(UsuarioUtils.novoUsuarioDTOparaUsuarioDTO(novoUsuarioDTO));
        }

        return usuarioDTOList;
    }
}
