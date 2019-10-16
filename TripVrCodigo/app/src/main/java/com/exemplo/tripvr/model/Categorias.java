package com.exemplo.tripvr.model;

public class Categorias {

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
