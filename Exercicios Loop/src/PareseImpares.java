import java.util.Scanner;

public class PareseImpares {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner (System.in);

    int num;
    int quantNumeros;
    int quantImpar = 0;
    int quantPar = 0;

        System.out.println("Quantidade de numeros: ");
        quantNumeros = scan.nextInt();

    int count = 0;

    do {
        System.out.println("Numero: ");
        num = scan.nextInt();

        count ++;
    if (num % 2 == 0) quantPar ++;
    else quantImpar ++;

        

    } while (count < quantNumeros);

     System.out.println("Quantidade Par: " + quantPar);
     System.out.println("Quantidade Impar: " + quantImpar);
    }
}

