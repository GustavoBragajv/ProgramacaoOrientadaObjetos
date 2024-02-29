/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio001;

/**
 *
 * @author higor
 */
public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistindo;
    
    
    public Gafanhoto() {
        super();
    }
    
    
    public Gafanhoto(String nome, int idade, char sexo, String login) {
        super();
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setLogin(login);
        this.setTotAssistindo(0);
    }

    
    public String getLogin() {
        return login;
    }

    
    public void setLogin(String login) {
        this.login = login;
    }

    
    public int getTotAssistindo() {
        return totAssistindo;
    }
    

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }
    
    
    public void viuMaisUm() {
        this.setTotAssistindo(this.getTotAssistindo() + 1);
    }
    
    

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() +  ", login=" + login + ", totAssistindo=" + totAssistindo + '}';
    }

    
    public void infoGafanhoto() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Login: " + this.getLogin());
        System.out.println("Total Assistido: " + this.getTotAssistindo());
    }

    
    
}
