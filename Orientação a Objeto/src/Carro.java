 class Carro {
        
        String cor;
        String modelo;
        int capacidadeTanque;

        Carro(){

        }
        Carro (String cor, String modelo, int capacidadeTanque){
            this.cor = cor;
            this.modelo = modelo;
            this.capacidadeTanque = capacidadeTanque;
        }
    
        void setCor (String cor){
            this.cor = cor;
        }

        String getcor (){
            return cor;
        } 

        void setmodelo (String modelo){
            this.modelo = modelo;
        }

        String getmodelo (){
            return modelo;
        }

        void setcapacidadeTanque (int capacidadeTanque){
            this.capacidadeTanque = capacidadeTanque;
        }

        int getcapacidadeTanque (){
            return capacidadeTanque;
        }

        double totalValorTanque (double valorCombustivel){
          return capacidadeTanque * valorCombustivel;
        } 
    }
