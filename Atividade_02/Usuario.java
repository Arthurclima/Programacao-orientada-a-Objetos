package Atividade_02;

public class Usuario extends Pessoa {
    private int matricula;

    public Usuario(String nome, String email, int matricula) {
        super(nome, email); // Chama o construtor da classe mãe (Pessoa)
        this.matricula = matricula;
    }

    public void exibirInfo() {
        System.out.println("--- Informações do Usuário ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Matrícula: " + this.matricula);
    }
}