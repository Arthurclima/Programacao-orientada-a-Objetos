package Atividade_02;

public class Instituicao implements Tomador_Emprestimo{
    private String nome;
    private String cnpj;
    private String cidade;

    public Instituicao(String nome, String cnpj, String cidade) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getcnpj() {
        return cnpj;
    }

    public void setcnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Cidade: " + this.cidade);
    }
}
