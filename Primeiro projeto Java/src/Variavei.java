
public class Variavei {
    public static void main(String[] args) {
    
        //Variáveis;
       int a=5;
       int b=6;
        String resultado = a==b ?"verdadeiro" : "falso";
    
            String primeiroNome = "Talita";
            String segundoNome = "Gama";
    
            String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
    
            System.out.println(nomeCompleto + resultado);
    
        }
        public static String nomeCompleto(String primeiroNome, String segundoNome) {
            return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
        }
    
}
