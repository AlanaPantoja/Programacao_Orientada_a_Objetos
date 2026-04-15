
public class Vaca extends Animal {
    private boolean parideira;

    public Vaca(String nome, boolean parideira) {
        super(nome);
        this.parideira = parideira;
    }

    public boolean getParideira() {
        return parideira;
    }

    public void setParideira(boolean parideira) {
        this.parideira = parideira;
    }

    @Override
    public void emitirSom(){
        System.out.println(getNome()+" Faz: MUUUU");
    }
    @Override
    public void mover(){
        System.out.println(getNome() + " Esta andando pelo pasto");
    }
}
