public class Papagaio extends Animal {
    private String tamanhoDoBico;

    public Papagaio(String nome, String tamanhoDoBico) {
        super(nome);
        this.tamanhoDoBico = tamanhoDoBico;
    }

    public String getTamanhoDoBico() {
        return tamanhoDoBico;
    }

    public void setTamanhoDoBico(String tamanhoDoBico) {
        this.tamanhoDoBico = tamanhoDoBico;
    }
    @Override
    public void emitirSom(){
        System.out.println(super.getNome() + "Tamanho do bico: " +getTamanhoDoBico() );
        System.out.println("Emiti o som: " +"Curupaco");
    }
    @Override
    public void mover(){
        System.out.println(getNome() + " Esta Voando");
    }

}
