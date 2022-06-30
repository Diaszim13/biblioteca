package model;

import model.Livro;
import model.Pessoa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Locacao {

    private Long id;

    private Pessoa pessoa;
    private List<Livro> livros;
    private LocalDateTime dataInicial;
    private LocalDateTime dataFinal;

    public Locacao(Long id, Pessoa pessoa, List<Livro> livros, LocalDateTime dataInicial, LocalDateTime dataFinal) {
        this.id = id;
        this.pessoa = pessoa;
        this.livros = livros;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public Locacao(Pessoa p, List<Livro> livrosById, LocalDate now) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void setDataFinal(LocalDateTime dataFinal) {
        this.dataFinal = dataFinal;
    }

    public LocalDateTime getDataFinal() {
        return dataFinal;
    }
}
