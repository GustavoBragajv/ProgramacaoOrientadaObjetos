/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismoteste;

/**
 *
 * @author higor
 */
public class Computador extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.21;
    
    public Computador(String nome, double valor) {
        super(nome, valor);
    }
    
    @Override
    public double calcularImposto(){
        System.out.println("Calculando o imposto do Computador");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
