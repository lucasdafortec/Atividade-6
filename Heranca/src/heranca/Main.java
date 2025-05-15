
package heranca;

import heranca.model.*;

public class Main {


    public static void main(String[] args) {
     
        Carro carro = new Carro("Ford", "Focus",20,true);
        carro.exibirDetalhes();
        System.out.println("\n =========================");
        Moto moto = new Moto("Yamaha", "X554", 1000);
        moto.exibirDetalhes();
        
    }
    
}
