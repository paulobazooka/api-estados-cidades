package com.bazooka.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Estado extends AbstractEntity{

    @Column(unique = true, nullable = false)
    @NotEmpty(message = "Sigla obrigatória")
    private String sigla;

    @Column(unique = true, nullable = false)
    @NotEmpty(message = "Nome obrigatória")
    private String nome;
    @OneToMany
    private List<Cidade> cidades = new ArrayList<>();

    public Estado() {
    }

    public Estado(String nome) {
        this.nome = nome;
    }

    public Estado(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    public void adicionarCidade(Cidade cidade){
        this.cidades.add(cidade);
    }
}
