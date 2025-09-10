package Atividade01;

public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador(8, 128, 4, 1000.0f);
        Sistema_Operacional os = new Sistema_Operacional(pc);

        Programa progama1 = new Programa(8, 100, 2, 32000);
        os.executarPrograma(progama1);

        Programa progama2 = new Programa(12, 80, 2, 4000);
        os.executarPrograma(progama2);

        Programa progama3 = new Programa(4, 200, 2, 40000);
        os.executarPrograma(progama3);
    }
}

