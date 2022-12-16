import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Desafio4 {
    
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
		
    double M = input.nextInt();
    double S = input.nextInt(); 
    
    double porcentagem = (((M - S)/M) *100);
    
    System.out.println("O desconto foi de " + (int)porcentagem + "%");
}
}