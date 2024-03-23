/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumeradoresteste;

import java.util.Iterator;

/**
 *
 * @author higor
 */
public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");
    
    
    private int VALOR;
    private String nomeRelatorio;
    
    /**
     *
     * @param valor
     */
    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }
    
    public static TipoCliente tipoclientePorNomeRelatorio(String nomeRelatorio){
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }

    public int getVALOR() {
        return VALOR;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
    
    
}
