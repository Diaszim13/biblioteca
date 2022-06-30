package Service;

import db.bancoLivros;
import model.Pessoa;

import java.util.List;

public class PessoaService {

    void cadastraUsuario(Pessoa p) {
        bancoLivros.pessoas.add(p);
    }

    List<Pessoa> listaUsuarios() {
        return bancoLivros.pessoas.;
    }

    void deletaUsuario(Pessoa p) {
        bancoLivros.pessoas.remove(p);
    }

    public static Pessoa selecionaPessoaPorId(Integer id) {
        return bancoLivros.pessoas.get(id);
    }
}
