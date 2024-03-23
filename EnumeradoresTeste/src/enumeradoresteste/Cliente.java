/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeradoresteste;

/**
 *
 * @author higor
 */
public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;
    //private String tipoCliente;
    // Ao invés de fazer como mostrado abaixo podemos criar classes enum para o mesmo.
    //private static final String PESSOA_FISICA = "PESSOA_FISICA";
    //private static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";

    public Cliente() {
        super();
    }

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        super();
        /*
        if((!tipoCliente.equals(PESSOA_FISICA)) && (!tipoCliente.equals(PESSOA_JURIDICA))){
            return;
        }
        */
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }
    
    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoCliente=" + tipoCliente.getVALOR() + ", tipoPagamento=" + tipoPagamento + '}';
    }

    
    
    
}
