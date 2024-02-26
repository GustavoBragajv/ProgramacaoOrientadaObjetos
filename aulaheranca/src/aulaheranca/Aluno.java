package aulaheranca;

import java.util.ArrayList;
import java.util.Random;

public class Aluno extends Pessoa{
    private Cursos curso;
    private int matricula;
    private boolean statusMatricula;
    
    
    public Aluno() {
        super();
    }
    
    
    public Aluno(Cursos curso, int matricula) {
        super();
        this.setCurso(curso);
        this.setMatricula(matricula);
        this.setStatusMatricula(false);
    }

    
    public Cursos getCurso() {
        return curso;
    }

    
    public void setCurso(Cursos curso) {
        this.curso = curso;
    }

    
    public int getMatricula() {
        abrirMatricula();
        return this.matricula;
    }

    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
    public boolean getStatusMatricula() {
        return this.statusMatricula;
    }
    
    
    public void setStatusMatricula(boolean statusMatricual) {
        this.statusMatricula = statusMatricual;
    }
    
    
    public void abrirMatricula() {
        if(!this.getStatusMatricula()) {
            this.setStatusMatricula(true);
        }
        
    }
    
    
    public void cancelarMatricula() {
        if(this.getStatusMatricula()) {
            this.setStatusMatricula(false);
            this.setMatricula(0);
        }
    }
    
    
    public void infoAluno() {
        System.out.println("Curso: " + this.getCurso().getNomeCurso());
        System.out.println("Situação da matricula: " + this.getStatusMatricula());
        System.out.println("Matricula: " + this.getMatricula());
    }
}
