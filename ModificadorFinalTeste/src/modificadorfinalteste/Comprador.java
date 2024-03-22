/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modificadorfinalteste;

/**
 *
 * @author higor
 */
public class Comprador {
    private String nome;
    private String cpf;
    private char sexo;
    private byte idade;
    
    
    public Comprador() {
        super();
    }
    
    public Comprador(String nome, String cpf, char sexo, byte idade) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }
    
    
}
