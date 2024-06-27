package associacaobidirecional4.teste;

import associacaobidirecional4.dominio.Jogador;
import associacaobidirecional4.dominio.Time;

public class JogadorTeste {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Maradona");
        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("Aguero");
        Jogador jogador3 = new Jogador("Romero");
        Jogador[] jogadores = {jogador, jogador1, jogador2, jogador3};
        
        Time time = new Time("Seleção Argentina");
        
        jogador.setTime(time);
        jogador1.setTime(time);
        jogador2.setTime(time);
        jogador3.setTime(time);
        
        time.setJogadores(jogadores);
        
        System.out.println("======== Jogadores ========");
        jogador.imprime();
        
        System.out.println("======== Time ========");
        time.imprimir();
    }
}
