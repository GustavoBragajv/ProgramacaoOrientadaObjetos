/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio001;

/**
 *
 * @author higor
 */
public class Exercicio001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gafanhoto[] gafan = new Gafanhoto[2];
        Video[] videos = new Video[3];
        Visualizacao[] vis = new Visualizacao[5];
        gafan[0] = new Gafanhoto("Higor", 27, 'M', "HiggorBraga");
        gafan[1] = new Gafanhoto("Vitor Gabriel", 27, 'M', "VitorBraga");
        videos[0] = new Video("Aula 01 de POO");
        videos[1] = new Video("Aula 12 de PYTHON");
        videos[2] = new Video("Aula 23 de JAVASCRIPT");
        //System.out.println(.toString());
        //System.out.println(vis[0].toString());
        vis[0] = new Visualizacao(gafan[0], videos[2]);
        vis[0].avaliar(5);
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(gafan[0], videos[1]);
        vis[0].avaliar(87.5);
        
        
        System.out.println(vis[0].toString());
        //gafan[0].infoGafanhoto();
    }
    
}
