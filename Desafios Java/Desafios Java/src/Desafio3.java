import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {     

    String[] nomesFila = new String[3]; 
    Scanner nome = new Scanner (System.in);

    int posicao = 0;
    for (String nomes : nomesFila){
        nomes = nome.next();
        posicao ++;
        System.out.println(nomes + " - Está na posição:" + posicao);
      }
    }
}