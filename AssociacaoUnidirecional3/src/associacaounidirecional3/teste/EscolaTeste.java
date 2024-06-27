package associacaounidirecional3.teste;

import associacaounidirecional3.dominio.Escola;
import associacaounidirecional3.dominio.Professor;

public class EscolaTeste {
    public static void main(String[] args) {
        Professor professor = new Professor("Fernando Kairo");
        Professor professor1 = new Professor("Marlene de Souza");
        Professor professor2 = new Professor("Carmem Miranda");
        Professor professor3 = new Professor("Matheus Teixeira");
        Professor professor4 = new Professor("Rebeca Barrile");
        Professor professor5 = new Professor("José Camargo");
        Professor[] professores = {professor, professor1, professor2, professor3, professor4, professor5};

        
        Escola escola = new Escola("Javali Cansado", professores);
        
        escola.imprime();
    }
}
