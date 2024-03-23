/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesabstratasteste;

/**
 *
 * @author higor
 */
public class Gerente extends Funcionario{
    
    
    public Gerente(String nome, double salario, String cpf, char sexo, int idade){
        super(nome, salario, cpf, sexo, idade);
    }

    @Override
    public void calcularBonus() {
        this.salario += this.salario * 0.2;
    }


}
