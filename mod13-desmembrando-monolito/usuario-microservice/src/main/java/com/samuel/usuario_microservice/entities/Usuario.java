package com.samuel.usuario_microservice.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import java.util.UUID;

@Entity
public class Usuario {
    @Id
    private String id;

    private String nome;
    private String login;
    private Integer idade;
    private Integer alturaCm;

    public Usuario() {
    }

    public Usuario(String id, String nome, String login, Integer idade, Integer alturaCm) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.idade = idade;
        this.alturaCm = alturaCm;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(Integer alturaCm) {
        this.alturaCm = alturaCm;
    }

    @PrePersist
    public void criaId() {
        this.id = UUID.randomUUID().toString();
    }
}
