import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
    int nota;

    System.out.println("Insira uma nota de 0 a 10: ");
        nota = scan.nextInt();

    while (nota < 0 | nota > 10){
        System.out.print("Insira uma nota válida: ");
        nota = scan.nextInt();
    }
        
 }
 
}
