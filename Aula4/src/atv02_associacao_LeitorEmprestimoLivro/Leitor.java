package atv02_associacao_LeitorEmprestimoLivro;

public class Leitor {
    private String nome;
    private int matricula;
    private String email;
    private String telefone;

    public Leitor(String nome, int matricula, String email, String telefone) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.telefone = telefone;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.telefone);
    }
    public void confirmarEmprestimo(){

    }
}
