package associacaoarraysobjetos1.teste;

import associacaoarraysobjetos1.dominio.Jogador;


public class AssociacaoArraysObjetos1Teste {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Maradona", 1974);
        Jogador jogador2 = new Jogador("Messi", 1987);
        Jogador jogador3 = new Jogador("Ronaldinho", 1972);
        
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        
        for(Jogador jogador : jogadores) {
            System.out.println(jogador.toString());
        }
    }
}
