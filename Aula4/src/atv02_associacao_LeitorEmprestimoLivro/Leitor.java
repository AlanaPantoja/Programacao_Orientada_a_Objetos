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
    public void atualizarContato(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }


    public String exibirInformacoes(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.telefone);
        return exibirInformacoes();
    }
    public void confirmarEmprestimo(Livro livro){
        System.out.println("Leitor " + "Realizou o emprestimo do livro:" + livro);


    }
}
