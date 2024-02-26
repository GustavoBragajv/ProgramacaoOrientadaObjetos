/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaheranca;


/**
 *
 * @author higor
 */
public class Professor extends Pessoa{
    private String especialidade;
    private double salario;
    //private Pessoa professor;
    
    
    public Professor() {
        super();
    }
    
    
    public Professor(String especialidade, double salario) {
        super();
        this.setEspecialidade(especialidade);
        this.setSalario(salario);
    }

    
    public String getEspecialidade() {
        return especialidade;
    }

    
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    
    public double getSalario() {
        return salario;
    }
    

    public void setSalario(double salario) {
        this.salario = salario;
    }
      
    
    public void receberAumento(int novoSalario) {
        this.setSalario(this.getSalario() + novoSalario);
    }
    
    
    public void infoProfessor() {
        System.out.println("Nome Professor: " + this.getNome());
        System.out.println("Especialidade: " + this.getEspecialidade());
        System.out.println("Salario: " + this.getSalario());
    }
    
}
