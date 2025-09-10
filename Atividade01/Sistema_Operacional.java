package Atividade01;

public class Sistema_Operacional {
    private Computador PC;

    public Sistema_Operacional(Computador PC){
        this.PC = PC;
    }

    public boolean executarPrograma(Programa p){
        if(p.getSSDOcupado() > PC.getSSD()){
            System.out.println("Erro na instalação do programa: SSD ocupado maior que SSD disponível.");
            return false;
        }
        if(p.getMemoriaRAMAlocada() > PC.getMemoriaRAM()){
            System.out.println("Erro na execução do programa: memória RAM alocada maior que a disponível.");
            return false;
        }
        System.out.println("Programa executado com sucesso!");
        float tempoExecucao = (float) p.getQuantidadeOperacoes() / (PC.getOperacoesPorSegundo() * PC.getNucleos());
        System.out.println("Tempo de execução: " + tempoExecucao + " segundos.");
        return true;
    }

    // Getter e Setter
    public Computador getPC(){
        return PC; }
    public void setPC(Computador PC)
        {  this.PC = PC; }
}
