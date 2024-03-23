/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesabstratasteste;

/**
 *
 * @author higor
 */
public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected char sexo;
    protected int idade;

    
    public Pessoa() {
        super();
    }

    
    public Pessoa(String nome, String cpf, char sexo, int idade) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.idade = idade;
    }
    
    
    public abstract void imprimirInformacoes();

    
    
}
