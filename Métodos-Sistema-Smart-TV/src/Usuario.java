public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();
      
        System.out.println("Primeiro Status da TV");
        System.out.println("---------------------------------------------------------");
        System.out.println("TV ligada? "+ smartTv.ligada);
        System.out.println("Canal atual: "+ smartTv.canal);
        System.out.println("Volume atual: "+ smartTv.volume);
        System.out.println("---------------------------------------------------------");
       
        System.out.println(" ");
        smartTv.ligar();
        System.out.println("Novo Status =>TV ligada? "+ smartTv.ligada);
        smartTv.desligar();
        System.out.println("TV ligada? "+ smartTv.ligada);
        
        smartTv.aumentarVolume();
        System.out.println("Novo Status => Volume: "+ smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Novo Status => Volume: "+ smartTv.volume);

        smartTv.mudarCanal( 33);
        System.out.println("Novo Volume: "+smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Aumentando o canal para: "+ smartTv.canal);
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Diminuindo o canal para: "+ smartTv.canal);

    }
}
