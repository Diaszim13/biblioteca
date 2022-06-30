package db;

import model.Livro;
import model.Locacao;
import model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class bancoLivros {
    public static List<Livro> livros = new ArrayList<>();
    public static List<Pessoa> pessoas = new ArrayList<>();
    public static List<Locacao> locacaos = new ArrayList<>();

    public bancoLivros() {
        livros.add(new Livro(1, "Livro teste", true, "matheus", 2));
        livros.add(new Livro(2, "Livro teste 1", true, "matheus", 5));
        livros.add(new Livro(3, "Livro teste 2", true, "matheus", 2));
        livros.add(new Livro(4, "Livro teste 3", true, "matheus",1));
    }


}
