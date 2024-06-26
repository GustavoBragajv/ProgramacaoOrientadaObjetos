package metodosestaticos.teste;

import metodosestaticos.dominio.Carro;

public class MetodosEstaticos {
    public static void main(String[] args) {
        // Alterando a velocidade limite de todas instâncias de carro criado.
        Carro.setVelocidadeLimite(180);
        
        
        Carro carro1 = new Carro("BMW X4 M(F98)", "BMW", "Esportiva", 2015, 285);
        Carro carro2 = new Carro("Polo Track", "Volkswagen", "Casual", 2014, 169);
        Carro carro3 = new Carro("Fiat Titano", "Fiat", "Picape", 2023, 130);
        
        
        
        
        
        System.out.println(carro1.toString());
        System.out.println("==========================================================================================================================");
        System.out.println(carro2.toString());
        System.out.println("==========================================================================================================================");
        System.out.println(carro3.toString()); 
        
        // Não podemos usar dentro de métodos estaticos variaveis, atributos que não são estaticos
        // Mas podemos usar atributos e variaveis estaticas dentro de metodos não estaticos.
        // Só é recomendados usar métodos estaticos quando eles não forem acessar atributos de instancia.
    }
}
