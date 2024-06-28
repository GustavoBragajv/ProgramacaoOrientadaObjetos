package associacaoexercicio05.dominio;

public class Local {
    private String endereco;
    
    public Local() {}
    
    public Local(String endereco) {
        this.endereco = endereco;
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
