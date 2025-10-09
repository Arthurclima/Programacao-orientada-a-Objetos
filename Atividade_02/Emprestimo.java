package Atividade_02;

public class Emprestimo {
    private Pessoa pessoa;
    private Material material;
    private String dataEmprestimo;
    private String dataDevolucao;

    // Construtor
    public Emprestimo(Pessoa pessoa, Material material, String dataEmprestimo, String dataDevolucao) {
        this.pessoa = pessoa;
        this.material = material;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public void exibirDetalhes() {
        System.out.println("\n======= DETALHES DO EMPRÉSTIMO =======");
        System.out.println("Data do Empréstimo: " + this.dataEmprestimo);
        System.out.println("Data de Devolução: " + this.dataDevolucao);
        System.out.println();

        this.pessoa.exibirInfo();
        System.out.println();

        this.material.descricao();

        System.out.println("======================================");
    }
}
