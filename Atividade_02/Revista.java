package Atividade_02;

public class Revista extends Material {
    private int edicao;

    public Revista(String titulo, int anoPublicacao, int edicao) {
        super(titulo, anoPublicacao); // Chama o construtor da classe mãe (Material)
        this.edicao = edicao;
    }

    public void descricao() {
        System.out.println("--- Descrição da Revista ---");
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano de Publicação: " + getAnoPublicacao());
        System.out.println("Edição: " + this.edicao);
    }
}