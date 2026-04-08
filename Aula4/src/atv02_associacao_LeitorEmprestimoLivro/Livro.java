package atv02_associacao_LeitorEmprestimoLivro;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean emprestado;

    public Livro(String titulo, String autor, String isbn, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.emprestado = false;
    }
    public void marcarComoEmprestado(){
        emprestado = true;
    }
    public void marcarComoDisponivel(){
        emprestado = false;
    }
    public boolean isEmprestado() {
        return emprestado;
    }


    public void exibirInfomacoes(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Emprestado: " + this.emprestado);

    }








}
