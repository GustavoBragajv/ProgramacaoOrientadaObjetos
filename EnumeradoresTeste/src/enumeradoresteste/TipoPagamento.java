/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumeradoresteste;

/**
 *
 * @author higor
 */
public enum TipoPagamento {
    DEBITO{
        @Override
        public double calcularDesconto(double valor){
            return valor * 0.1;
        }
    }, CREDITO {
        @Override
        public double calcularDesconto(double valor){
            return valor * 0.05;
        }
    };
    
    
    public abstract double calcularDesconto(double valor);
}
