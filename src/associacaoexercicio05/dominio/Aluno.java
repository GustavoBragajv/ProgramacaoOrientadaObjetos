package associacaoexercicio05.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Aluno {
    private String nome;
    private String dataNascimento;
    private int idade;
    private Seminario seminario;
    
    public Aluno() {}
    
    public Aluno(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        calcularIdade();
    }
    
    public Aluno(String nome, String dataNascimento, Seminario seminario) {
        this(nome, dataNascimento);
        this.seminario = seminario;
    }
    
    public int calcularIdade() {
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimentoFormatada = LocalDate.parse(dataNascimento, dataFormatada);
        LocalDate dataAtual = LocalDate.now();
        
        
        int diaAtual = dataAtual.getDayOfMonth();
        int mesAtual = dataAtual.getMonthValue();
        int anoAtual = dataAtual.getYear();
        
        int diaNascimento = dataNascimentoFormatada.getDayOfMonth();
        int mesNascimento = dataNascimentoFormatada.getMonthValue();
        int anoNasciemnto = dataNascimentoFormatada.getYear();
        
        if(mesAtual >= mesNascimento) {
            if(diaAtual >= diaNascimento) {
                idade = anoAtual - anoNasciemnto;
            }
        } else {
            idade = (anoAtual - anoNasciemnto) - 1;
        }
        return this.idade;
                
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public String getDataNascimento() {
        return this.dataNascimento;
    }
    
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public Seminario getSeminario() {
        return this.seminario;
    }
    
    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
