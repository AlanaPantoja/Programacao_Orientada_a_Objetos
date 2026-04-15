import java.util.ArrayList;
import java.util.List;
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

        System.out.println("Imprimindo Lista:");

        List<Animal> lista = new ArrayList<>();
        lista.add(papagaio);
        lista.add(vaca);
        lista.add(gato);

        for (Animal animal : lista) {
            System.out.println(animal);
        }




    }
}
