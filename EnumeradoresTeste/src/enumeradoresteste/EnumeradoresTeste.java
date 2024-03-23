/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumeradoresteste;

/**
 *
 * @author higor
 */
public class EnumeradoresTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente1 = new Cliente("Higor", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Claudete", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        Cliente cliente3 = new Cliente("Alameda", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente4 = new Cliente("Maldilema", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        
        TipoCliente tipoCliente2 = TipoCliente.tipoclientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
    
}
