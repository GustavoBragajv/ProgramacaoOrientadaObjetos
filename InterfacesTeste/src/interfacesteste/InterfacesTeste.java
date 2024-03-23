/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfacesteste;

/**
 *
 * @author higor
 */
public class InterfacesTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CarregarBaseDados carregarBaseDados = new CarregarBaseDados();
        CarregarArquivos carregarArquivos = new CarregarArquivos();
        
        carregarBaseDados.carregar();
        carregarBaseDados.remover();
        carregarBaseDados.checarPermissao();
        System.out.println(" ");
        carregarArquivos.carregar();
        carregarArquivos.remover();
        carregarArquivos.checarPermissao();
    }
    
}
