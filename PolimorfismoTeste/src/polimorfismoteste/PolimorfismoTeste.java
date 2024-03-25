package polimorfismoteste;

import polimorfismoservico.CalculadoraImposto;

public class PolimorfismoTeste {

    public static void main(String[] args) {
        Produto produto = new Computador("M10i7", 15000);
        Tomate tomate = new Tomate("Tomate Galeno", 10);
        tomate.setDataValidade("09/05/2024");
        
        
        CalculadoraImposto.calcularImpostoProduto(produto);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        CalculadoraImposto.calcularImpostoProduto(tomate);
    }
    
}
