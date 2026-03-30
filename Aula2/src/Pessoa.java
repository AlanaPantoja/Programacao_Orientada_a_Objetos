public class Pessoa {
   private String nome;
    private int idade;

    public Pessoa() {

    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void mostrarDados(){
       System.out.println("Seus Dados:");
        System.out.println("Nome: " +getNome());
        System.out.println("idade: " + getIdade());

    }
}
