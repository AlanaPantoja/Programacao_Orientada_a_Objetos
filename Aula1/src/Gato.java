public class Gato {
    String nome;
    int qtdcomidaDisponivel;
    boolean sono = true;

    public Gato(String nome,int qtdcomidaDisponivel,boolean sono){
        this.nome = nome;
        this.qtdcomidaDisponivel = qtdcomidaDisponivel;
        this.sono = sono;

    }

    public void comer(){
        qtdcomidaDisponivel -=1;
        System.out.println(nome + " Comeu. comida restante: " + qtdcomidaDisponivel);

    }
    public void dormir(){
        if( sono = this.sono) {
            System.out.println(nome +  " Nao esta com sono porque ja dormiu");
        }else {
            System.out.println(nome + " esta com sono");
        }

    }

    public void cacar(){
        System.out.println(nome + " Cacou uma barata");
    }
}
