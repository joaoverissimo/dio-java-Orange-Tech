public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.maiorCanal();

        System.out.println("Canal Atual : " + smartTv.canal);

        smartTv.mudarCanal( 14);
        System.out.println("Canal Atual :" + smartTv.canal);

        System.out.println("Volume Atual : " + smartTv.volume);
        System.out.println("TV Ligada ? " + smartTv.ligada);
        smartTv.ligar ();
        System.out.println ("Novo Status -> TV Ligada ? " + smartTv.ligada);
    }
}
