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
        livro.marcarComoEmprestado();
        leitor.confirmarEmprestimo(livro);
    }

    public void exibirResumo(){
        System.out.println("Emprestimo: ");
        System.out.println(leitor.exibirInformacoes());
        System.out.println(livro.exibirInfomacoes());
        System.out.println("Retirada: " + dataRetirada);
        System.out.println("Devolucao prevista: " + dataDevolucao);
    }

    public void devolverLivro(){
        livro.marcarComoDisponivel();
        System.out.println("Livro devolvido: " + livro.exibirInfomacoes());
    }

    public boolean estaAtrasado(LocalDate hoje){
        return dataRetirada.equals(hoje);
    }

}
