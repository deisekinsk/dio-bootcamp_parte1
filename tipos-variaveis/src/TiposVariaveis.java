/**
 * https://glysns.gitbook.io/java-basico/
 * Java possui oito tipos primitivos:
 * int (4 byte), byte (1 byte), short (2 byte), long (8 byte), float (4 byte), double (8 byte), boolean e chart. São armazenados na pilha de memória (memori stack). A JVM por padrão tenta converte o valor para int. Por isso o 
 */

 /**
 * Todo arquivo começa com letra maiúscula, sem espaço com camelCase:
 * ProjectOne.java
 * 
 * A classe possui o mesmo nome que o arquivo.
 * 
 * As variáveis são escritas com minúscula, sem espaço, com camelCase. É permitido utilizar _ e $ para concatenação. As variáveis se trata de um valor que está/estará na memória. Estrutura:]
 *      tipo nomeBemDefinido = Atribuição E/OU Não;
 * 
 * Palavras Reservadas:
 * final: não deixa mudar a variável. Valor constante. 
 */


public class TiposVariaveis {
    final String BR = "Brasil";
    double PI = 3.14F; //final
    long quantidade = 2222255566L; //termina com L
    int ANO_2000 = 2000;
    int ESTADOS_BRASILEIRO = 27; //valores que iniciam com zero usar outro tipo

    boolean casaPropria;
    boolean estaLigado = false;    

    //converção
    short shortNumber = 1;
    int normalNumber = shortNumber;
    short shortNumber2 = (short) normalNumber;

}
