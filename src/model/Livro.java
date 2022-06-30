package model;

import java.util.ArrayList;
import java.util.List;

public class Livro {

    private Integer id;
    private String titulo;
    private Boolean disponivel;
    private String autor;
    private Integer quantidade;
    public Livro(Integer id, String titulo, Boolean disponivel, String autor, Integer quantidade) {
        this.id = id;
        this.titulo = titulo;
        this.disponivel = disponivel;
        this.autor = autor;
        this.quantidade = quantidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
