package blocoinicializacao.dominio;


public class Anime {
    private String nome;
    //private int[] episodios = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    // outra maneira de criar atributos com array sem passar os parâmetros na declaração do atributo.
    private int[] episodios;
    
    // Para não ter que copiar e colar em todos os construtores esses for, 
    //usamos os blocos de inicialização de instacia que são executado sempre que um objeto é criado.
    // O bloco de inicialização de instancia é sempre criado depois dos atributos e antes dos construtores.
    
    {
        System.out.println("Dentro do bloco de inicialização");
        
        episodios = new int[100];
        
        for(int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
        
    }
    
    public Anime(String nome) {
        this.nome = nome;

    }
    
    
    public Anime() {
        
        for(int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println("");
    }
    
    
    public int[] getEpisodio() {
        return this.episodios;
    }
    
    /*
        Ordem de tudo o que foi visto até agora na criação de um objeto
        1 - Alocado espaço em memória para o objeto
        2 - Cada atributo da classe é criado e inicializado com os valores default (padrão) ou com os valores passados para eles.
        3 - Bloco de inicialização é executado
        4 - Construtor é executado.
    */
}
