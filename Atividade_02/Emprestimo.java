package Atividade_02;

public class Emprestimo {
    private Tomador_Emprestimo tomador_emprestimo;
    private ItemEmprestado item_emprestado;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(Tomador_Emprestimo tomador_emprestimo,  ItemEmprestado item_emprestado, String dataEmprestimo, String dataDevolucao) {
        this.tomador_emprestimo = tomador_emprestimo;
        this.item_emprestado = item_emprestado;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public void exibirDetalhes() {
        System.out.println("\n======= DETALHES DO EMPRÉSTIMO =======");
        System.out.println("Data do Empréstimo: " + this.dataEmprestimo);
        System.out.println("Data de Devolução: " + this.dataDevolucao);
        System.out.println();


        this.tomador_emprestimo.exibirInfo();
        System.out.println();

        this.item_emprestado.descricao();

        System.out.println("======================================");
    }
}
