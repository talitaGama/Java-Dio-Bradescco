public class Usuario {
  
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv.ligado);
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);

    smartTv.ligar ();
    smartTv.aumentarVolume();
    smartTv.mudarCanal(54);


    System.out.println(smartTv.ligado);
    System.out.println(smartTv.canal);
    System.out.println(smartTv.volume);

    }
    
}
