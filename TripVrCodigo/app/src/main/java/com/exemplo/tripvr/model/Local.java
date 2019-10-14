package com.exemplo.tripvr.model;

public class Local {

    String nome,endereco,horario,id,Categoria;

    public Local(String nome, String endereco, String horario, String id, String categoria) {
        this.nome = nome;
        this.endereco = endereco;
        this.horario = horario;
        this.id = id;
        Categoria = categoria;
    }
    public Local(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }
}
