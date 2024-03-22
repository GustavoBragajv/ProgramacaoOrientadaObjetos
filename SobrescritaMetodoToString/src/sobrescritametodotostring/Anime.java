/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobrescritametodotostring;

/**
 *
 * @author higor
 */
public class Anime extends Object{
    private String nome;
    
    
    public Anime() {
        super();
    }
    
    
    public Anime(String nome) {
        this.nome = nome;
    }
    
    
    public String getNome() {
        return nome;
    }
    
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    @Override
    public String toString() {
        return "Anime: " + this.nome;
    }
}
