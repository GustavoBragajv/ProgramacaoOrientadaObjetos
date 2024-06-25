package construtores;


public class Anime {
    private String nome;
    private String tipo;
    private String genero;
    private int episodios;
    
    // Criando um construtor passando todos os atributos da classe como argumento.
    public Anime(String nome, String tipo, String genero, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.episodios = episodios;
    }
    
    // Criando o método imprime
    
    public void imprime() {
        // Não é recomendado que classes que vão se tornar objetos tenham métodos de impressão na tela.
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Genero: " + this.genero);
        System.out.println("Episódios: " + this.episodios);
    }
    
    // Criando os métodos set e get

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
    
    
}
