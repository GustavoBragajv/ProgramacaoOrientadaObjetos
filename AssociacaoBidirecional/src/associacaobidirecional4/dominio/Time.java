package associacaobidirecional4.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;
    
    public Time() {}
    
    public Time(String nome) {
        this.nome = nome;
    }
    
    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }
    
    public void imprimir() {
        System.out.println("Nome Time: " + this.nome);
        
        if(jogadores == null) return;
        
        System.out.print("Jogadores: ");
        for(Jogador jogador : jogadores) {
            System.out.print(jogador.getNome() + " ");
        }
        System.out.println("");
    }
        
    
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return this.jogadores;
    }
    
    public void setJogadores (Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
