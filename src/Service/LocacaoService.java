package Service;

import db.bancoLivros;
import model.Livro;
import model.Locacao;
import model.Pessoa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class LocacaoService {

    public static void efetuaLocacao(Pessoa p, List<Integer> livrosId) {
        livrosId.forEach(id -> {
            if(!livroDisponivel(id)) {
                System.out.println("O livro com id: " + id + "Não esta disponivel!");
            }
        });
        bancoLivros.locacaos.add(new Locacao(p, getLivrosById(livrosId), LocalDate.now()));
        getLivrosById(livrosId).stream().map(l -> {
           l.setQuantidade(l.getQuantidade()-1);
           if(l.getQuantidade() == 0) {
               l.setDisponivel(false);
           }
            return null;
        });
     }

    void devolveLivro(Locacao locacao, List<Integer> livrosId) {
        getLivrosById(livrosId).stream().map(l -> {
            l.setQuantidade(l.getQuantidade()+1);
            if(livroDisponivel(l.getId())) {
                l.setDisponivel(true);
            }
                l.setQuantidade(l.getQuantidade()+1);
                if(locacao.getDataFinal().isAfter(LocalDateTime.now())) {
                    double divida = 0.0;
                    int diasDevendo = locacao.getDataFinal().getDayOfMonth() - LocalDateTime.now().getDayOfMonth();
                    for(int i = 0; i <= diasDevendo; i++) {
                        if(divida > 20) {
                            divida += 1;
                        }
                        divida+=0.5;
                    }
                    System.out.println("Seu debito pelo atraso de:" + diasDevendo + "Dias, foi de: " + divida);
                }

            return bancoLivros.locacaos.remove(locacao);
        });
    }

    Locacao getLocacaoById(Long locacaoId) {
        return bancoLivros.locacaos.stream().filter(loc -> Objects.equals(loc.getId(), locacaoId)).findFirst().get();
    }
    private static Boolean livroDisponivel(Integer id) {
          Livro livroDisp = bancoLivros.livros.stream().filter(livro -> livro.getId() == id)
                .findFirst().get();
          return livroDisp.getDisponivel();
    }

    private static Livro getLivrosById(Integer livrosId) {
           return bancoLivros.livros.stream().filter(livro -> livro.getId() == livrosId)
                    .findFirst().get();
    }
}
