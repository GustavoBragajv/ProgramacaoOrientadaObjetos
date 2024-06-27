package associacaounidirecional3.dominio;


public class Escola {
    private String nomeEscola;
    private Professor[] professores;
    
    public Escola() {}
    
    public Escola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }
    
    public Escola(String nomeEscola, Professor[] professores) {
        this.nomeEscola = nomeEscola;
        this.professores = professores;
    }
    
    public void imprime() {
        System.out.println("Nome da escola: " + this.nomeEscola);
        
        if(professores == null) return;
        
        for(Professor professor : professores) {
            System.out.println("Professores: " + professor.getNomeProfessor());
        }
        
        
        /*
            Outra forma de fazer a mesma impressão;
            if(professores != null) {
                for(Professor professor : professores) {
                    System.out.println("Professores: " + professor.getNomeProfessor());
                }
            }ã
            return;
        */
        
    }
    
    public String getNomeEscola() {
        return this.nomeEscola;
    }
    
    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }
    
    public Professor[] getProfessores() {
        return this.professores;
    }
    
    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
