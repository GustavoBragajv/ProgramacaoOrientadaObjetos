/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesteste;

/**
 *
 * @author higor
 */
public class CarregarArquivos implements CarregadorDados, RemoverDados{

    @Override
    public void carregar() {
        System.out.println("Carregando dados de um arquivo.");
    }
    
    @Override
    public void remover() {
        System.out.println("Removendo dados de um arquivo.");
    }
    
    @Override
    public void checarPermissao() {
        System.out.println("Checando permissões dos arquivos");
    }
    
}
