package associacaounidirecional3.dominio;


public class Professor {
    private String nomeProfessor;
    
    public Professor() {}
    
    public Professor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }
    
    public String getNomeProfessor() {
        return this.nomeProfessor;
    }
    
    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }
}
