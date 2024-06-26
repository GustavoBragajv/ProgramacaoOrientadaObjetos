package associacaounidirecional2.teste;

import associacaounidirecional2.dominio.Jogador;
import associacaounidirecional2.dominio.Time;


public class AssociacaoUnidirecionalTeste {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Maradona");
        Time time = new Time("Seleção Argentina");
        
        // Associação unidirecional
        jogador.setTime(time);
        
        jogador.imprime();
    }
}
