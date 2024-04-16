package Metodos;
public class Metodos {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);


        smartTv.ligar();
        smartTv.aumentarVolume();
        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        smartTv.mudarCanal(20);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("TV ligada? " + smartTv.ligada);
    }
}
