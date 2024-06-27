package leituradadostecladoconsole.teste;

import java.util.Scanner;

public class LeituraDadosTecladoConsoleTeste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();
        
        System.out.print("Digite sua data de nascimento: ");
        int dataNascimento = scan.nextInt();
        
        System.out.println("Seu nome é: " + nome + " e você nasceu em " + dataNascimento);
    }
}
