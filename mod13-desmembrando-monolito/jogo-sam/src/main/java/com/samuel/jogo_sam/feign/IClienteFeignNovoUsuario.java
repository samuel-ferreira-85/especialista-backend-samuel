package com.samuel.jogo_sam.feign;

import com.samuel.jogo_sam.dto.NovoUsuarioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "cliente-novo-usuario", url = "http://localhost:8082")
public interface IClienteFeignNovoUsuario {
    @RequestMapping(method = RequestMethod.POST, path = "/usuarios")
    NovoUsuarioDTO criarNovoUsuario(@RequestBody NovoUsuarioDTO novoUsuarioDTO);
}
