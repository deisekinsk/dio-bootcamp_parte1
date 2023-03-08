/**
 * Java Developer study on Digital Inovation One
 * @author Deise Kinsk kinsk@msn.com
 * @author https://www.linkedin.com/in/deise-kinsk-profile/
 * Use @param : methods and constructor 
 * Use @return : methods
 * Use @exception , @throws , @see   
 */

 /** Na declaração do método, os paramentros são separados por vírgula, e possui estrutura:
 * TipoDeRetorno NomeObjetivoVerboInfinito Parametro/os
 * @param somar: método do tipo inteiro de soma de duas variáveis
 * @param nomeCompleto: metódo que concatena duas variáveis
 * @param media: método que calcula a média.
 * @param main:  método estático que permiti sua execução a partir da máquina virtual Java*/

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

    public static void main(String[] args){

        String primeiroNome = "Deise";
        String ultimoNome = "Silva";

        String nomeCompleto = nomeCompleto(primeiroNome, ultimoNome);

        System.out.println("I'm "+
            nomeCompleto + " and I start with Java Doc. 🏡🫖🖥️");

        media(5,7,9);

    }
}
