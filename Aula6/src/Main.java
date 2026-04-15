public class Main {
    public static void main(String[] args) {
        Papagaio papagaio = new Papagaio("Loro jose", "Amazonica");
        papagaio.emitirSom();
        papagaio.mover();

        Vaca vaca = new Vaca("Bele", true);
        vaca.emitirSom();
        vaca.mover();

        Gato gato = new Gato("Geralde", "Laranja");
        gato.emitirSom();
        gato.mover();


    }
}
