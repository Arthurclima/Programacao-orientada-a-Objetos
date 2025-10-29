package Atividade_02;

public class NomeinvalidoException extends Exception{
    public NomeinvalidoException(){
        super(new Exception ("Nome Inválido"));
    }
}
