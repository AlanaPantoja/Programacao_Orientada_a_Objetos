public class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void emitirSom(){
        System.out.println(getNome() + "Emite som");
    }

    public void mover(){
        System.out.println(getNome() + " Moversse");
    }
}

