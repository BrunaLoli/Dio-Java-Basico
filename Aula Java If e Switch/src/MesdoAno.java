public class MesdoAno {
    public static void main(String[] args) {

// Exiba o nome do mês do ano de acordo com seu numero.
        int mes = 8;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2){
            System.out.println("Fevereiro");
        } else if (mes == 3){
            System.out.println("Março");
        } else if (mes == 4){
                System.out.println("Abril");
        } else if (mes == 5){
            System.out.println("Maio");
        } else if (mes == 6){
            System.out.println("Junho");
        } else if (mes == 7){
            System.out.println("Julho");
        } else if (mes == 8){
            System.out.println("Agosto");    
        } else if (mes == 9){
            System.out.println("Setembro");
        } else if (mes == 10){
            System.out.println("Outubro");
        } else if (mes == 11){
            System.out.println("Novembro");
        } else if (mes == 12){
            System.out.println("Dezembro");
        } else {
            System.out.println("Valor não é válido");
        }

// A partir do dia da semana exiba seu numero usando Switch
    
String dia = "Quarta";
    switch (dia){
        case "Segunda":
            System.out.println("2");
            break;
        case "Terça":
            System.out.println("3");
            break;
        case "Quarta":
            System.out.println("4");
            break;
        case "Quinta":
            System.out.println("5");
            break;
        case "Sexta":
            System.out.println("6");
            break;
        case "Sabado":
            System.out.println("7");
            break;
        case "Domingo":
            System.out.println("1");
            break;
        default:
            System.out.println("Dia inválido");
            

        }

        }
    }
