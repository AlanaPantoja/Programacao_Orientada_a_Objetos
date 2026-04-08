package atv02_associacao_LeitorEmprestimoLivro;

import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Leitor leitor;
    private LocalDate dataRetirada;
    private LocalDate dataDevolucao;

    public Emprestimo(Livro livro, Leitor leitor, LocalDate dataRetirada, LocalDate dataDevolucao) {
        this.livro = livro;
        this.leitor = leitor;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;


        exibirResumo();
    }

    public void exibirResumo(){
        System.out.println("Dados do leitor: " );
        leitor.exibirInformacoes();

        System.out.println("Dados do livro: " );
        livro.exibirInfomacoes();


    }
}
