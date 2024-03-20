/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesaninhadas;


class OutraClasse{
    int x = 10;

    class ClasseInterna {
        int i = 5;
    }
}


public class ClassesAninhadas {

    public static void main(String[] args) {
        // TODO code application logic here
        OutraClasse minhaClasse = new OutraClasse();
        OutraClasse.ClasseInterna classeInterna = minhaClasse.new ClasseInterna();
        System.out.println(classeInterna.i + minhaClasse.x);
    }

}

