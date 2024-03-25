/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismoservico;

import polimorfismoteste.Produto;
import polimorfismoteste.Tomate;


/**
 *
 * @author higor
 */
public class CalculadoraImposto {
    
    public static void calcularImpostoProduto(Produto produto) {
        System.out.println("Relatório de imposto do Produto");
        double impostoProduto = produto.calcularImposto();
        System.out.println("Computador: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + impostoProduto);
        if(produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }
    
}
