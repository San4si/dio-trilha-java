public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.volume = 2;

        smartTv.ligar();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(15);

        System.out.println("A Tv esta ligada?: " + smartTv.ligada);
        System.out.println("O Volume da Tv é: " + smartTv.volume);
        System.out.println("A Tv esta no canal: " + smartTv.canal);
    }
}
