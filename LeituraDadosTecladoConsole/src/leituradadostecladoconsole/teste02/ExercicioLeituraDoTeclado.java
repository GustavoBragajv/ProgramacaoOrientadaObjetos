package leituradadostecladoconsole.teste02;

import java.util.Scanner;

public class ExercicioLeituraDoTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite sua pergunta: ");
        String pergunta = scan.nextLine();
        
        
        if(pergunta.charAt(0) == ' ') {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }
    }
}
