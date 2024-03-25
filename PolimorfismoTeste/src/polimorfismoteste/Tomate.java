/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismoteste;

/**
 *
 * @author higor
 */
public class Tomate extends Produto{
    
    public static final double IMPOSTO_POR_CENTO = 0.06;
    private String dataValidade;
    
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }
    
    
    public String getDataValidade() {
        return this.dataValidade;
    }
    
    
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    
    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }
    

}
