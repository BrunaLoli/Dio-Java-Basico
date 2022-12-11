import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int [] vetor = {5,7,9,11,15,17};

        System.out.print("Vetor: ");

        int count = 0;

        while (count < (vetor.length)){
           System.out.print(vetor [count] +" ");
            count ++;

        }
        System.out.print("Vetor: ");
        for (int i = (vetor.length - 1); i >= 0; i --){
            System.out.print(vetor[i] + " ");
            
    }
}

}