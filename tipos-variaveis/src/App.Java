/**
 * Java Developer study on Digital Inovation 
 * @author Nome Deise Kinsk E-mail kinsk@msn.com
 * Linkedin https://www.linkedin.com/in/deise-kinsk-profile/
 * 
 * Use @param : methods and constructor 
 * Use @return : methods
 * Use @exception , @throws , @see   
 * 
 * */

 public class App {

    public static Integer somar (int numA, int numB){
        return numA+numB;

    };

    public static String nomeCompleto(String primeiroNome, String ultimoNome){
        return primeiroNome.concat(" ").concat(ultimoNome);

    };

    public static void media(int notaA, int notaB, int notaC){
        int mediaFinal;
        mediaFinal = (notaA + notaB + notaC) / 3;

        if (mediaFinal > 6){
            System.out.println("APROVADO");
        }else if(mediaFinal == 6){
            System.out.println("PROVA RECUPERAÇÂO");
        }else{
            System.out.println("REPROVADO");
        }    
        
    };

    /**
     * @param args
     */
    public static void main(String[] args){

        String primeiroNome = "Deise";
        String ultimoNome = "Silva";
        
        
        int jogoDaSorte = 2023;
        int numeroRecebe = -7;
        numeroRecebe = numeroRecebe * -1;
   

        String nomeCompleto = nomeCompleto(primeiroNome, ultimoNome);

        System.out.println("I'm "+
            nomeCompleto + " and I start with Java Doc.");

        media(5,7,9);
        System.out.println(" " + primeiroNome + " " + ultimoNome);
        System.out.println(2*+ jogoDaSorte);
        System.out.println(numeroRecebe);
    }
}
