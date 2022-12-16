public class Emprestimo {

    public static int duasParcelas(){
        return 2;
    }
    public static int tresParcelas(){
        return 3;
    }
    public static double getTaxaDuasParcelas(){
        return 0.3;
    }
    public static double getTaxaTresParcelas(){
        return 0.45;
    }
    
    public static void calcular(double valor, double d){

        if ( d == 2){

            double valorFinal = valor + (valor * getTaxaDuasParcelas());

            System.out.print("Valor final das 2 parcelas: " + valorFinal);

        }
        else if(d == 3){
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.print("Valor final das 3 parcelas: " + valorFinal);
        }

        else 
        System.out.println("Quantidade de parcelas não aceita.");

    }
    
}
    
