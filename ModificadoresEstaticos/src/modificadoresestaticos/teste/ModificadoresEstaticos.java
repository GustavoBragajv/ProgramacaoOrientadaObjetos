package modificadoresestaticos.teste;

import modificadoresestaticos.dominio.Carro;


public class ModificadoresEstaticos {

    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW X4 M(F98)", "BMW", "Esportiva", 2015, 285);
        Carro carro2 = new Carro("Polo Track", "Volkswagen", "Casual", 2014, 169);
        Carro carro3 = new Carro("Fiat Titano", "Fiat", "Picape", 2023, 130);
        
        // Alterando a velocidade limite de todas instâncias de carro criado.
        Carro.velocidadeLimite = 180;
        
        
        System.out.println(carro1.toString());
        System.out.println("==========================================================================================================================");
        System.out.println(carro2.toString());
        System.out.println("==========================================================================================================================");
        System.out.println(carro3.toString());        
    }

}
