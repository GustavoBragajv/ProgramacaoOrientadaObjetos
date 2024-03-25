/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismoteste;

/**
 *
 * @author higor
 */
public abstract class Produto implements Taxavel{
    protected String nome;
    protected double valor;
    
    
    public Produto() {
        super();
    }
    
    
    public Produto(String nome, double valor) {
        super();
        this.nome = nome;
        this.valor = valor;
    }
    
    
    public String getNome() {
        return this.nome;
    }
    
    
    public double getValor() {
        return this.valor;
    }
}
