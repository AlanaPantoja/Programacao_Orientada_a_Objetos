public class Vaca extends Animal{
    private int quantidadeDeLeite;

    public Vaca(String nome,int quantidadeDeLeite){
        super(nome);
        this.quantidadeDeLeite = quantidadeDeLeite;
    }
    public int getQuantidadeDeLeite(){
        return quantidadeDeLeite;
    }

    public void setQuantidadeDeLeite(int quantidadeDeLeite) {
        this.quantidadeDeLeite = quantidadeDeLeite;
    }
    @Override
    public void emitirSom(){
        System.out.println(super.getNome() +" Quantidade de leite do Vaca= " + quantidadeDeLeite);
        System.out.println(super.getNome() + "esta emitindo o som: " + " MUU" );
    }
    @Override
    public void mover(){
        System.out.println(getNome() + " Esta pastando");
    }


}
