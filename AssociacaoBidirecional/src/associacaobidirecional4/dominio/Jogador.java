package associacaobidirecional4.dominio;

public class Jogador {
    private String nome;
    private Time time;
    
    // Se quisermos que na hora de criar o objeto jogador ele ja defina um time basta passarmos o time no construtor.
    public Jogador(String nome) {
        this.nome = nome;
    }
    
    public Jogador(String nome, Time time) {
        this.nome = nome;
        this.time = time;
    }
    
    
    public void imprime() {
        System.out.println("Nome: " + this.nome);
        
        // Usamos o if aqui para fazer a checagem, pois se o objeto time não for criado vamos receber um NullPointerException
        if(time != null) {
            System.out.println("Time: " + time.getNome());
        }
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Time getTime() {
        return this.time;
    }
    
    public void setTime(Time time) {
        this.time = time;
    }
}
