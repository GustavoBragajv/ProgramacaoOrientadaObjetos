/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesabstratasteste;

/**
 *
 * @author higor
 */
public abstract class Funcionario extends Pessoa{
    protected double salario;
    

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, double salario, String cpf, char sexo, int idade) {
        super(nome, cpf, sexo, idade);
        this.salario = salario;
        calcularBonus();
    }
    
    
    public abstract void calcularBonus();

    @Override
    public void imprimirInformacoes(){
        System.out.println("Imprimindo Informações dos Funcionarios");
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Idade: " + this.idade);
    }
    
    
}
