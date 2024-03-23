/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesabstratasteste;

/**
 *
 * @author higor
 */
public class ClassesAbstratasTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gerente gerente = new Gerente("Higor", 5000, "43612567802", 'M', 26);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Amadilene", 12000, "15821125847", 'F', 35);
        
        gerente.imprimirInformacoes();
        System.out.println(" ");
        desenvolvedor.imprimirInformacoes();
    }
    
}
