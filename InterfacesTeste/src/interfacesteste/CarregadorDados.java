/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfacesteste;

/**
 *
 * @author higor
 */
public interface CarregadorDados {
    public static final int MAX_DATA_SIZE = 10;
    
    public abstract void carregar();
    
    public abstract void checarPermissao();
    
    public static void retriveMaxDataSize() {
        System.out.println("Dentro do retriveMaxDataSize na interface");
    }
}
