public class Aplicação {
    
    public static void main(String[] args) {
      
    
    Carro carro1 = new Carro("Vermelho", "Gol", 30);
    
    System.out.println("Cor: " + carro1.getcor());
    System.out.println("Modelo: " + carro1.getmodelo());
    System.out.println("Capacidade tanque: " + carro1.getcapacidadeTanque());
    System.out.println("Valor para encher o tanque: " + carro1.totalValorTanque(5.50));

}
}
