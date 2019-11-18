package com.example.javarecyclerexample;

public class Anime {

    private String nome;
    private String protagonista;

    public Anime(String nome, String protagonista) {
        this.nome = nome;
        this.protagonista = protagonista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }
}
