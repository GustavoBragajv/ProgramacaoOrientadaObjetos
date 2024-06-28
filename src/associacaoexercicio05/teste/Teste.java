package associacaoexercicio05.teste;

import associacaoexercicio05.dominio.Aluno;
import associacaoexercicio05.dominio.Local;
import associacaoexercicio05.dominio.Professor;
import associacaoexercicio05.dominio.Seminario;


public class Teste {
    public static void main(String[] args) {
        Local local = new Local("Parque Municipal");
        Local local1 = new Local("Rua das Goiabeiras");
        //Aluno aluno = new Aluno("Higor Gustavo", "25/10/1997");
        //Aluno aluno1 = new Aluno("Ana Cacheado", "12/05/2005");
        Professor professor = new Professor("Bruce Baner", "Programador");
        Professor professor1 = new Professor("Carlos Montanha", "Engenheiro de Software");
        
        
        //Aluno[] alunos = {aluno, aluno1};
                
        Seminario seminario = new Seminario("Programando com Amor", local);
        //Seminario seminario2 = new Seminario("Procurando Pokémon", alunos, local1);
        Seminario[] seminariosDisposniveis = {seminario};
        
        
        professor.setSeminarios(seminariosDisposniveis);
        professor1.setSeminarios(seminariosDisposniveis);
        
        System.out.println(professor.toString());
        System.out.println(professor1.toString());
    }
}
