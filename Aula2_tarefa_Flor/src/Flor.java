public class Flor {
    String nome;
    String cor;
    boolean possuiPerfume;

    public Flor() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void MostrarDados() {
        System.out.println("Nome da Flor: " + getNome());
        System.out.println("Cor da Flor: " + getCor());


        if (possuiPerfume) {
            System.out.println("Possui perfume: Sim");
        } else {
            System.out.println("Possui perfume: Não");
        }
    }
}
