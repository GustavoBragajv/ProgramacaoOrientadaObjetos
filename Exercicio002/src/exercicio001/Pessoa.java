/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio001;

/**
 *
 * @author higor
 */
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected char sexo;
    protected double experiencia;
    
    
    public Pessoa() {
        super();
    }
    
    
    public Pessoa(String nome, int idade, char sexo, double experiencia) {
        super();
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setExperiencia(0);
    }

    
    public String getNome() {
        return nome;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public int getIdade() {
        return idade;
    }

    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    public char getSexo() {
        return sexo;
    }

    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
    public double getExperiencia() {
        return this.experiencia;
    }
    
    
    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }
        
    
    protected void ganharExperiencia() {
        
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade +
                ", sexo=" + sexo + ", experiencia=" + experiencia + '}';
    }
    
    
    
}
