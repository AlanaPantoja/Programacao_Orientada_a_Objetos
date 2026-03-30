
public class Main {
    public static void main (String args[]){
        Gato gato1 = new Gato("Sushi", 3,true);
        gato1.comer();
        gato1.dormir();
        gato1.comer();

        Gato gato2 = new Gato("Cachaça",1,false);
        gato2.comer();
        gato2.dormir();
        gato2.cacar();

        Gato gato3 = new Gato("Perola",0,true);
        gato3.cacar();
        gato3.dormir();


    }
}

