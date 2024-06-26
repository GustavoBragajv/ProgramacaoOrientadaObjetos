package metodosestaticos.dominio;


public class Carro {
    private String nome;
    private String marca;
    private String modelo;
    private int anoFabricacao;
    
    
    // Atributo static passa a ser atributo da classe.
    // Alterando o atributo velocidadeLimite para atributo static
    // Para acessarmos esse atributo fora da classe carro temos que deixar o modificador de acesso como public até aprendermos a usar os metodos static.
    //private static double velociadeLimite = 250;
    private static double velocidadeLimite = 250;
    private double velocidadeMaxima;
    
    
    
    public Carro(String nome, String marca, String modelo, int anoFabricacao, double velocidadeMaxima) {
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    public Carro() {
        
    }
    
    public String toString() {
        return "Nome: " + this.nome +
                " Marca: " + this.marca + 
                " Modelo: " + this.modelo + 
                " Ano de Fabricação: " + this.anoFabricacao +
                //" Velocidade Limite: " + this.velociadeLimite + // Ao alterar o atributo para static não é recomendado acessar através do this e sim do nome da classe.
                "Velocidade Limite: " + Carro.velocidadeLimite +
                " Velocidade Maxima: " + this.velocidadeMaxima;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite; // alterando o método para que ele fique como estatico.
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        // Assim que deixamos os métodos estaticos não podemos mais usar a palavra-chave this.
        Carro.velocidadeLimite = velocidadeLimite; // alterando o método para que ele fique como estatico.
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    
    
}
