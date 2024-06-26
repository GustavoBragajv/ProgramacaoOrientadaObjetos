package associacaoarraysobjetos1.dominio;


public class Jogador {
    private String nome;
    private int anoNascimento;
    
    
    public Jogador(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
    public String toString() {
        return "Nome: " + this.nome +
                "\nAno Nascimento: " + this.anoNascimento + 
                "\n====================================";
    }
        
}
