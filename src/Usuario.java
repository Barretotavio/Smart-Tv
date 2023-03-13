public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        String tvFuncionando = smartTv.tv == "Ligada" ? "Ligada" : "Desligada";

        System.out.println("A Tv está " + tvFuncionando);

        if (tvFuncionando == "Desligada") {
            return;
        }

        smartTv.ligar();
        System.out.println("Status da TV " + smartTv.tv);

        System.out.println("Canal: " + smartTv.canal);

        System.out.println("Volume: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("O volume está em: " + smartTv.volume);

        smartTv.mudarCanal(15);

        smartTv.desligar();
        System.out.println("Status da TV " + smartTv.tv);

    }

}
