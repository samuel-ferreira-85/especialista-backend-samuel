package com.samuel.sam_mongodb.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "jogo")
public class Jogo {

    private String id;
    private String nome;
    private String distribuidora;
    private String desenvolvedor;
    private String plataforma;

    public Jogo(String nome, String distribuidora, String desenvolvedor, String plataforma) {
        this.nome = nome;
        this.distribuidora = distribuidora;
        this.desenvolvedor = desenvolvedor;
        this.plataforma = plataforma;
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

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getDesenvolvedor() {
        return desenvolvedor;
    }

    public void setDesenvolvedor(String desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}