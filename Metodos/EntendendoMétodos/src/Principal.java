public class Principal {
   
    public static void main(String[] args) {
        
        System.out.println("Calculadora");

        Calculadora.soma(1,6);
        Calculadora.subtração(7,1);
        Calculadora.divisao(10,2);
        Calculadora.multiplicacao(2,10);

        System.out.println("Mensagem");
        Mensagem.obtermensagem(6);

        System.out.println("Emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getTaxaDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTaxaTresParcelas());

        }
}
