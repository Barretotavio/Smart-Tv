public class SmartTv {

    String tv = "Ligada";
    int canal = 1;
    int volume = 25;

    public void ligar() {
        tv = "Ligada";
    }

    public void desligar() {
        tv = "Desligada";
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void subirCanal() {
        canal++;
    }

    public void descerCanal() {
        canal--;
    }
}
