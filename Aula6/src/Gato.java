public class Gato extends Animal {
    private String pelugem;

    public Gato(String nome, String pelugem) {
        super(nome);
        this.pelugem = pelugem;
    }

    public String getPelugem() {
        return pelugem;
    }

    public void setPelugem(String pelugem) {
        this.pelugem = pelugem;
    }
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " Faz: MIAU");
    }
    @Override
    public void mover(){
        System.out.println(getNome()+ " esta saltando");
    }
}
