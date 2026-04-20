public class Gato extends Animal {
    private boolean flexivel;

    public Gato(String nome, boolean flexivel) {
        super(nome);
        this.flexivel = flexivel;
    }

    public boolean getFlexivel() {
        return flexivel;
    }

    public void setFlexivel(boolean flexivel) {
        this.flexivel = flexivel;
    }
    @Override
    public void emitirSom(){
        System.out.println(getNome() + " Flexivel: " + flexivel);
        System.out.println(getNome()+ "Emitindo som: " + "MIAU");
    }
    @Override
    public void mover(){
        System.out.println(getNome() + " Esta aprontando");
    }
}
