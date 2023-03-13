public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("A Tv está ligada? " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("Status -> Tv ligada? " + smartTv.ligada);

        System.out.println("Canal: " + smartTv.canal);

        System.out.println("Volume: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("O volume está em: " + smartTv.volume);

        smartTv.mudarCanal(15);

        smartTv.desligar();
        System.out.println("Status -> Tv ligada? " + smartTv.ligada);

    }

}
