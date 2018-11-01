package com.bazooka.api.model;

import javax.persistence.Entity;


@Entity
public class Cidade extends AbstractEntity {

    private String nome;


    public Cidade() {
    }

    public Cidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
