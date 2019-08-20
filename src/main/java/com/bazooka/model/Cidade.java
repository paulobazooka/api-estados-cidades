package com.bazooka.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Cidade{

    @Id
    private Integer id;
    private String nome;
    private Integer estado;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
