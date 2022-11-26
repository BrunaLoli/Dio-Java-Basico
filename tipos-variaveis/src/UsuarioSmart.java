public class UsuarioSmart {

    public static void main(String[] args)  throws Exception {

        SmartTv smartTv = new SmartTv ();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        
        System.out.println("TV ligada: " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("Novo Status: Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status: Tv Desligada? " + smartTv.ligada);

        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Novo Canal: " + smartTv.canal);

    }
}
