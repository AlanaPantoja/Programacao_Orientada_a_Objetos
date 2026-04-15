
public class Papagaio extends Animal {
    private String regiao;

    public Papagaio(String nome, String regiao) {
        super(nome);
        this.regiao = regiao;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
    @Override
    public void emitirSom() {
        System.out.println(super.getNome() +" Diz: Curupaco");
    }

    @Override
    public void mover(){
        System.out.println(super.getNome() + " esta voando");
    }

}
