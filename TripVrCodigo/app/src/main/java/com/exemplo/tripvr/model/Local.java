package com.exemplo.tripvr.model;

public class Local {

    String nome,endereco,horario,id,Categoria,sobre,foto1,foto2,video,foto,nomePesquisar;

    public String getNomePesquisar() {
        return nomePesquisar.toUpperCase();
    }

    public void setNomePesquisar(String nomePesquisar) {
        this.nomePesquisar = nomePesquisar;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public String getFoto1() {
        return foto1;
    }

    public void setFoto1(String foto1) {
        this.foto1 = foto1;
    }

    public String getFoto2() {
        return foto2;
    }

    public void setFoto2(String foto2) {
        this.foto2 = foto2;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Local(String nome, String endereco, String horario, String id, String categoria, String sobre, String foto1, String foto2, String video, String foto) {
        this.nome = nome;
        this.endereco = endereco;
        this.horario = horario;
        this.id = id;
        Categoria = categoria;
        this.sobre = sobre;
        this.foto1 = foto1;
        this.foto2 = foto2;
        this.video = video;
        this.foto = foto;
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
