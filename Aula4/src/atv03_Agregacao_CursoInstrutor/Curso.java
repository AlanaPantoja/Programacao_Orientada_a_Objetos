package atv03_Agregacao_CursoInstrutor;

public class Curso {
    private String nome;
    private String cargaHoraria;
    private String nivel;
    private String descricao;
    private String instrutor1;
    private String instrutor2;

    public Curso(String nome, String cargaHoraria, String nivel, String descricao, String instrutor1, String instrutor2) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.nivel = nivel;
        this.descricao = descricao;
        this.instrutor1 = instrutor1;
        this.instrutor2 = instrutor2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getInstrutor1() {
        return instrutor1;
    }

    public void setInstrutor1(String instrutor1) {
        this.instrutor1 = instrutor1;
    }

    public String getInstrutor2() {
        return instrutor2;
    }

    public void setInstrutor2(String instrutor2) {
        this.instrutor2 = instrutor2;
    }

    public void associarInstrutor(Instrutor instrutor1) {
        if (instrutor1 == null) {
            instrutor1 = instrutor1;
        } else if (instrutor2 == null) {
            instrutor2 = instrutor2;
        } else {
            System.out.println("Não é possível adicionar mais instrutores a este curso.");
        }
    }

        public void exibirCurso () {
            System.out.println("Curso: " + getNome());
            System.out.println("CargaHoraria: " + getCargaHoraria());
            System.out.println("Nivel: " + getNivel());
            System.out.println("Descricao: " + getDescricao());
            System.out.println("Instrutores do curso: " + getInstrutor1() + getInstrutor2());
        }

}
