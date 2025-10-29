package Atividade_02;

public class Usuario extends Pessoa {
    private int matricula;

    public Usuario(String nome, String email, int matricula) throws Exception {
        super(nome, email);
        this.matricula = matricula;

        if(nome == null || nome.length() < 1){
            throw new NomeinvalidoException();
        }


    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }



    @Override
    public void exibirInfo() {
        System.out.println("--- Informações do Usuário ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Matrícula: " + this.matricula);
    }


}