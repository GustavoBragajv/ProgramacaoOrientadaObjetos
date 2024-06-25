package blocoinicializacao.teste;

import blocoinicializacao.dominio.Anime;


public class BlocoInicializacao {

    public static void main(String[] args) {
        Anime anime = new Anime("Pokémon");
        Anime anime1 = new Anime();
        
        
        for(int episodio : anime.getEpisodio()) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

}
