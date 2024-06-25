package construtores;


public class Construtores {

    public static void main(String[] args) {
        // Criando um objeto da classe Anime passando argumentos direto no construtor
        
        Anime anime = new Anime("Dragon Ball Z", "Infantil", "Ação", 125);
        
        anime.imprime();
    }

}
