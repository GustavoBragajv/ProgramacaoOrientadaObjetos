package sobrecargaconstrutores;


public class Anime {
    private String nome;
    private String tipo;
    private String genero;
    private String estudio;
    private int episodios;
    
    // Criando um construtor passando todos os atributos da classe como argumento.
    public Anime(String nome, String tipo, String genero, int episodios) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.episodios = episodios;
    }
    
    // Criando outro construtor sem parâmetros
    public Anime() {
        System.out.println("Construtor sem parâmetros");
    }
    
    // Criando outro contrutor com apenas um parâmetro
    public Anime(String nome, String tipo, String genero, int episodios, String estudio) {
        // Essa regra de chamar outros construtores dentro de construtores serve somente em construtores.
        // E se precisarmos chamar outro construtor a chamada deve ser a primeira linha.
        this(nome, tipo, genero, episodios);
        this.estudio = estudio;
    }
    
    // Criando o método imprime
    
    public void imprime() {
        // Não é recomendado que classes que vão se tornar objetos tenham métodos de impressão na tela.
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Genero: " + this.genero);
        System.out.println("Episódios: " + this.episodios);
        System.out.println("Estudio: " + this.estudio);
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
    
    public String getEstudio() {
        return this.estudio;
    }
    
    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
