package com.exemplo.tripvr.model;

import java.io.Serializable;

public class Categorias implements Serializable {

    String nome, nomePesquisar;

    public Categorias(){}



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomePesquisar() {
        return nomePesquisar.toUpperCase();
    }

    public void setNomePesquisar(String nomePesquisar) {
        this.nomePesquisar = nomePesquisar;
    }
}
