/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaheranca;

/**
 *
 * @author higor
 */
public class Cursos {
    private String nomeCurso;
    private Professor professor;
    private Aluno aluno;
    private int quantidadeHoras;
    private int quantidadeAulas;
    private int quantidadeAlunos;
    private int quantidadeTurmas;
    
    
    
    public Cursos() {
        super();
    }
    
    
    public Cursos(String nomeCurso, Professor professor, Aluno aluno, 
            int quantidadeHoras, int quantidadeAulas, int quantidadeAlunos, 
            int quantidadeTurmas) {
        super();
        this.setNomeCurso(nomeCurso);
        this.setProfessor(professor);
        this.setAluno(aluno);
        this.setQuantidadeHoras(quantidadeHoras);
        this.setQuantidadeAulas(quantidadeAulas);
        this.setQuantidadeAlunos(quantidadeAlunos);
        this.setQuantidadeTurmas(quantidadeTurmas);
        
    }

    
    public String getNomeCurso() {
        return this.nomeCurso;
    }

    
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    
    public Professor getProfessor() {
        return this.professor;
    }

    
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    
    public Aluno getAluno() {
        return this.aluno;
    }
    
    
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    
    public int getQuantidadeHoras() {
        return this.quantidadeHoras;
    }

    
    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    
    public int getQuantidadeAulas() {
        return this.quantidadeAulas;
    }

    
    public void setQuantidadeAulas(int quantidadeAulas) {
        this.quantidadeAulas = quantidadeAulas;
    }

    
    public int getQuantidadeAlunos() {
        
        return this.quantidadeAlunos;
    }

    
    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }
    
        
    public int getQuantidadeTurmas() {
        return this.quantidadeTurmas;
    }
    
    
    public void setQuantidadeTurmas(int quantidadeTurmas) {
        this.quantidadeTurmas = quantidadeTurmas;
    }
    
    
    public void infoCurso() {
        System.out.println("Nome Curso: " + this.getNomeCurso());
        System.out.println("Professor do curso: " + this.getProfessor().getNome());
        System.out.println("Nome do aluno: " + this.getAluno().getNome());
        System.out.println("Quantidade de horas: " + this.getQuantidadeHoras());
        System.out.println("Quantidade de aulas: " + this.getQuantidadeAulas());
        System.out.println("Quantidade de turmas: " + this.getQuantidadeTurmas());
        System.out.println("Quantidade de alunos na turma: " + this.getQuantidadeAlunos());
    }
    
    
}
