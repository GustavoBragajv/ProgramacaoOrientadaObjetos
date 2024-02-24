package relacionamentoclasses;

import java.util.Random;

public class Luta extends Lutador{
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean lutaAprovada;


    public Luta() {
        super();
    }


    public Luta(Lutador desafiado, Lutador desafiante, int rounds, boolean lutaAprovada) {
        this.setDesafiado(desafiado);
        this.setDesafiante(desafiante);
        this.setRounds(rounds);
        this.setLutaAprovada(lutaAprovada);
    }


    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isLutaAprovada() {
        return lutaAprovada;
    }

    public void setLutaAprovada(boolean lutaAprovada) {
        this.lutaAprovada = lutaAprovada;
    }


    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setLutaAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            System.out.println("Luta marcada com sucesso!");
        } else {
            this.setLutaAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            System.out.println("ERRO! Está luta não pode ser marcada.");
        }
    }


    public void lutar(){
        Random aleatorios = new Random();
        if(this.isLutaAprovada()) {
            System.out.println("#### DESAFIADO ####");
            this.getDesafiado().apresentarLutador();
            System.out.println("==================");
            System.out.println("#### DESAFIANTE ####");
            this.getDesafiante().apresentarLutador();

            int vencedor = aleatorios.nextInt(0, 3);
            switch (vencedor) {
                case 0: // Empate
                    System.out.println("Está luta deu Empate");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1: // Lutador 1 ganhou a luta (Desafiado)
                    System.out.println("Vitória do desafiado " + desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2: // Lutador 2 ganhou a luta (Desafiante)
                    System.out.println("Vitória do desafiante " + desafiante.getNome());
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
                default:
                    System.out.println("ERRO! Luta inválida");
                    break;
            }
        }else {
            System.out.println("ERRO! Está luta não pode acontecer");
        }
    }
}
