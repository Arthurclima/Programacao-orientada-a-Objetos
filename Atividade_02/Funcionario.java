package Atividade_02;

public class Funcionario extends Pessoa {
    private String cargo;


    public Funcionario(String nome, String email, String cargo) {
        super(nome, email); // Chama o construtor da classe mãe (Pessoa)
        this.cargo = cargo;
    }

    public void exibirInfo() {
        System.out.println("--- Informações do Funcionário ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Cargo: " + this.cargo);
    }
}