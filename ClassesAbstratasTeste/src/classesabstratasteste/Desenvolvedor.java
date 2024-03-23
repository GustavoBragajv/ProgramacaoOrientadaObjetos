/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesabstratasteste;

/**
 *
 * @author higor
 */
public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario, String cpf, char sexo, int idade){
        super(nome, salario, cpf, sexo, idade);
    }

    
    @Override
    public void calcularBonus() {
        this.salario += this.salario * 0.05;
    }
    
}
