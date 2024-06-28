package associacaoexercicio05.dominio;


public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;
    
    public Professor() {}
    
    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }
    
    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this(nome, especialidade);
        this.seminarios = seminarios;
    }
    
    public String toString() {
        StringBuffer sb = new StringBuffer();
        
        sb.append("========= Professores =========").append("\n");
        sb.append("Nome: " + this.nome).append(" \n");
        sb.append("Especialidade: ").append(this.especialidade).append("\n\n");
        
        if(this.seminarios == null) {
            sb.append("Não existe seminario agendado");
        } else {
            sb.append("========= Seminarios cadastrados =========");
            sb.append("\n");
            for(Seminario seminario : seminarios) {
                sb.append("Titulo: ").append(seminario.getTitulo()).append("\n");
                sb.append("Local: ").append(seminario.getLocal().getEndereco()).append("\n\n");
            }
            
            
            for(Seminario seminario : seminarios) {
                if((seminario.getAlunos() == null) || (seminario.getAlunos().length == 0)) continue;
                sb.append("========= Alunos =========");
                sb.append("\n");
                for(Aluno aluno : seminario.getAlunos()) {
                    sb.append("Aluno: ").append(aluno.getNome()).append(", idade: ").append(aluno.getIdade()).append(" anos").append("\n");                    
                }
            }
        }
        
        return sb.toString();
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEspecialidade() {
        return this.especialidade;
    }
    
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public Seminario[] getSeminarios() {
        return this.seminarios;
    }
    
    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
