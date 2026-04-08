package atv01_herancaSimples;

public class Professor extends Pessoa{
    private String disciplina;

    Professor(String nome, int idade, String disciplina){
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void ensinar(){
        System.out.println("Disciplina: " + getDisciplina());
    }

}
