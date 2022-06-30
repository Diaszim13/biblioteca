package Service;

import db.bancoLivros;
import model.Livro;

import java.util.List;
import java.util.Objects;

public class LivroService {

    public void cadastraLivro(Livro livro) {
        bancoLivros.livros.add(livro);
    }

    public static List<Livro> mostraLivrosCadastrados() {
        return bancoLivros.livros;
    }

    public Livro mostraLivroPorId(Integer livroId) {
        return (Livro) bancoLivros.livros.stream().filter(l -> Objects.equals(l.getId(), livroId));
    }

    public void deletaLivro(Livro livro) {
        bancoLivros.livros.remove(livro);
    }

    /*void salvaLivro(Integer id, String titulo, Boolean disponivel, String autor, Integer quantidade) {
        bancoLivros.livros.add(new Livro (id, titulo, disponivel, autor, quantidade));
    }*/
}
