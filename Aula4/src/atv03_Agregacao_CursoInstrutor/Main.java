package atv03_Agregacao_CursoInstrutor;

public class Main {
    public static void main(String[] args){
        Instrutor instrutor = new Instrutor("Rafael Lima","Educacao Fisica", "rafael@gmail.com", 5);
        Curso curso = new Curso("Educacao Fisica ", "100 horas ", "medio ", "curso para praticar atividades fisicas ", "Rafael lima", "Alana Brenda");
        curso.associarInstrutor(instrutor);
        curso.exibirCurso();
        instrutor.exibirInstrutor();
        instrutor.criarMaterialDeApoio("Lista de exercicios");
        instrutor.aplicarAvaliacao("historia do voleiball");
    }
}
