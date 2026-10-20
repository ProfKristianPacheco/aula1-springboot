package com.example.HelloSpring.model;

public class Musica {
    private int id;
    private String nome;
    private String artista;
    private double duracao;
    private String genero;

    @Override
    public String toString() {
        return "Musica{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", artista='" + artista + '\'' +
                ", duracao=" + duracao +
                ", genero='" + genero + '\'' +
                '}';
    }

    public Musica(int id, String nome, String artista, double duracao, String genero) {
        this.id = id;
        this.nome = nome;
        this.artista = artista;
        this.duracao = duracao;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
