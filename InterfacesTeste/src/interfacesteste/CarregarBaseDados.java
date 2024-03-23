/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesteste;

/**
 *
 * @author higor
 */
public class CarregarBaseDados implements CarregadorDados, RemoverDados{

    @Override
    public void carregar() {
        System.out.println("Carregando dados do banco de dados");
    }
    
    @Override
    public void remover() {
        System.out.println("Removendo dados do banco de dados");
    }
    
    @Override
    public void checarPermissao() {
        System.out.println("Checando permissões no banco de dados");
    }
    
}
