
public class Variavei {
    public static void main(String[] args) {
    
        //Variáveis;
    
            String primeiroNome = "Talita";
            String segundoNome = "Gama";
    
            String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
    
            System.out.println(nomeCompleto);
    
        }
        public static String nomeCompleto(String primeiroNome, String segundoNome) {
            return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
        }
    
}
