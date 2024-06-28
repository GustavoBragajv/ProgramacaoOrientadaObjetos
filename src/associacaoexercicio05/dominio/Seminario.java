package associacaoexercicio05.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;
    
    public Seminario() {}
    
    public Seminario(String titulo) {
        this.titulo = titulo;
    }
    
    public Seminario(String titulo, Aluno[] alunos) {
        this(titulo);
        this.alunos = alunos;
    }
    
    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this(titulo, alunos);
        this.local = local;
    }
    
    public Seminario(String titulo, Local local) {
        this(titulo);
        this.local = local;
    }
    
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setSeminario(String titulo) {
        this.titulo = titulo;
    }
    
    public Aluno[] getAlunos() {
        return this.alunos;
    }
    
    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    
    public Local getLocal() {
        return this.local;
    }
    
    public void setLocal(Local local) {
        this.local = local;
    }
}
