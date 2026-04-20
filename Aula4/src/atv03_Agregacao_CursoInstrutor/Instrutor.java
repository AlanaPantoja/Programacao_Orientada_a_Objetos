package atv03_Agregacao_CursoInstrutor;

public class Instrutor {
    private String nome;
    private String formacao;
    private String email;
    private int experienciaAnos;

    public Instrutor(String nome, String formacao, String email, int experienciaAnos) {
        this.nome = nome;
        this.formacao = formacao;
        this.email = email;
        this.experienciaAnos = experienciaAnos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getExperienciaAnos() {
        return experienciaAnos;
    }

    public void setExperienciaAnos(int experienciaAnos) {
        this.experienciaAnos = experienciaAnos;
    }

    public void exibirInstrutor() {
        System.out.println("Nome: " + getNome());
        System.out.println("Formacao: " + getFormacao());
        System.out.println("Email: " + getEmail());
        System.out.println("Experiencia Anos: " + getExperienciaAnos());
    }

    public void aplicarAvaliacao(String cursoNome) {
        System.out.println("Avaliacao aplicada: " + cursoNome);
    }

    public String responderDuvidas(String duvida) {
        System.out.println("Duvidas: " + duvida);
        return duvida;
    }

    public void criarMaterialDeApoio(String titulo) {
        System.out.println("Material: " + titulo);
    }

    public boolean agendarLive(String dataHora) {
        if (dataHora == String.valueOf(true)) {
            System.out.println("Livre! ");
        }else{
            System.out.println("Indisponivel!");

        }
        return false;
    }



}