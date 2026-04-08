package atv01_Associacao_CarroPessoa;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Dodger Ram","02as65fg");
        Pessoa pessoa = new Pessoa("Alana Brenda", "000.000.000-0");
        pessoa.usarCarro(carro);
    }
}
