package Sistema_radar;

public class Simulacao {
    public static void main(String[] args) {
        Carro opala = new Carro("ACLR300", 0, 76, "comodoro");
        Radar radar = new Radar("Pistão sul", 60);

        radar.avaliarVelocidade(opala);

        opala.acelerar(); // 10
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar(); // 70
        radar.avaliarVelocidade(opala);
    }
}
