import Service.LivroService;
import Service.LocacaoService;
import Service.PessoaService;
import db.bancoLivros;
import model.Livro;
import model.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*
Criar programa orientado à objetos para solucionar os seguintes casos de uso:
- Será o controle de uma biblioteca
- Desenvolver método para a locação de livro
- deverá validar se livro está disponível
- Método para reserva de livro
- Validá se há alguma reserva para data e se estará disponível
- Método para devolução do livro
- Válida se a data da entrega é anterior a data máxima
- caso tenha vencido calcular 50 centavos ao dia até 20 reais, depois 1 real por dia
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bancoLivros.pessoas.add(new Pessoa(3, "João"));
        bancoLivros.livros.addAll(List.of(
                new Livro(1, "Harry Potter e a Câmara Secreta",true, "Matheues", 2),
                new Livro(2, "Harry Potter e a Câmara Secreta",true, "Matheues", 3),
                new Livro(3, "Crime e Castigo", true, "Matheues",4),
                new Livro(4, "Florence and Gibs",true, "Matheues", 2),
                new Livro(5, "O Pequeno Principe",true, "Matheues", 1)
        ));

        System.out.println("Bem vindo a livraria!");

        System.out.println("Primeiro precisamos te identificar diga seu nome: ");
        String nomeUsuario = sc.nextLine();
        Pessoa p = {1, nomeUsuario};
        bancoLivros.pessoas.add(p);

        System.out.println("Escolha a opção que deseja\n 1 - Alugar livros \n 2 - devolver \n 3 - consultar livros disponiveis! \n");

        int opc = sc.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Aqqui estao os livros disponiveis: \n " + LivroService.mostraLivrosCadastrados());
                System.out.println("Diga o id do livro que deseja: ");
                List<Integer> livros = Collections.singletonList(sc.nextInt());
                LocacaoService.efetuaLocacao(p, livros);
                break;
            case 2:
                System.out.println("Por favor diga o seu id da sua locacao: ");
                int pessId = sc.nextInt();
                Pessoa pessoa = PessoaService.selecionaPessoaPorId(pessId);
                pessoa.get
                LocacaoService.devolveLivro();
                break;
            case 3:
                break;
        }
    }


}