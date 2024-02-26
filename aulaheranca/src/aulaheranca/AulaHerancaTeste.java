/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaheranca;

import java.util.Random;

/**
 *
 * @author higor
 */
public class AulaHerancaTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random aleatorios = new Random();
        Pessoa pessoa1 = new Pessoa("Higor", "43612567802", "25/10/1997", 'M');
        Aluno alunos = new Aluno();
        Professor professores = new Professor("Tecnologia", 1530.45);
        Funcionario funcionarios = new Funcionario("Faxina", true);
        Cursos curso = new Cursos("Programação", professores, alunos,
                360, 25, 30, 2);
        
        Cursos[] curso1 = new Cursos[2];
        
        curso1[0] = new Cursos("Programação", professores, alunos,
                360, 25, 30, 2);
        
        alunos.setNome("Gustavo Braga");
        professores.setNome("Gustavo Guanabara");
        funcionarios.setNome("Cleide Souza");
        alunos.setCurso(curso1[0]);
        curso.infoCurso();
        System.out.println("=======================");
        alunos.infoAluno();
        alunos.abrirMatricula();
        alunos.setMatricula(146978);
        alunos.infoAluno();
        alunos.cancelarMatricula();
        alunos.infoAluno();
        
        
        
        
    }
    
}
