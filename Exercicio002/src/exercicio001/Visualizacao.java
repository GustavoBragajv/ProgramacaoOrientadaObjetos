/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio001;

/**
 *
 * @author higor
 */
public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao() {
        super();
    }
    
    
    public Visualizacao(Gafanhoto espectador, Video filme) {
        super();
        this.setEspectador(espectador);
        this.setFilme(filme);
        this.espectador.setTotAssistindo(this.espectador.getTotAssistindo() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    
    public Gafanhoto getEspestador() {
        return this.espectador;
    }
    
    
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }
    
    
    public Video getFilme() {
        return this.filme;
    }
    
    
    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }
    
    
    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }
    
    
    public void avaliar(double porc) {
        int tot = 0;
        if(porc <= 20) {
            tot = 3;
        } else if(porc <= 50) {
            tot = 5;
        } else if(porc <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        
        this.filme.setAvaliacao(tot);
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador +
                ", filme=" + filme + '}';
    }
    
    
    
    
}
