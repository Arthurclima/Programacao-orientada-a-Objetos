package Sistema_radar;

public class Radar {

    public String localizacao;
    public Integer limiteVelocidade;

    public Radar(String localizacao, Integer limiteVelocidade){
        this.localizacao = localizacao;
        this.limiteVelocidade = limiteVelocidade;
    }

    public void emitirNotificacao(String placa, Integer velocidadeObservada){
        System.out.println("Placa: "+placa);
        System.out.println("Velocidade observada: "+velocidadeObservada);
        System.out.println("Localização: "+ this.localizacao);
        System.out.println("Velocidade da via: "+ this.limiteVelocidade);

    }

    public void avaliarVelocidade(Carro carro){
        if(carro.getvelocidade() > this.limiteVelocidade){
            emitirNotificacao(carro.getplaca(), carro.getvelocidade());
        }
    }

}

