import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

    
    int numFatorial;

    System.out.println("Fatorial: ");
    numFatorial = scan.nextInt();
    
    System.out.println(numFatorial + "! = ");
    int multiplicacao = 1;

    for(int count = numFatorial; count >= 1; count = count - 1){
    
    multiplicacao = multiplicacao * count;
    }

    System.out.println(multiplicacao);

    }
    }
