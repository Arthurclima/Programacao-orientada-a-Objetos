package Atividade_02;

public class Livro extends Material {
    private String autor;


    public Livro(String titulo, int anoPublicacao, String autor) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    public void descricao() {
        System.out.println("--- Descrição do Livro ---");
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano de Publicação: " + getAnoPublicacao());
        System.out.println("Autor: " + this.autor);
    }
}
