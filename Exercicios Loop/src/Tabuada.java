import java.util.Scanner;

public class Tabuada {
  
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

    int tabuada;

        System.out.println("Tabuada a gerar: ");
        tabuada = scan.nextInt();

        System.out.println("Tabuada: " + tabuada);

    for (int i = 1; i <= 10; i = i + 1) {
        System.out.println(tabuada + "x" + i + " = " + (tabuada*i));
    }
    }

}
