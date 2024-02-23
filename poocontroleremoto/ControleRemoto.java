package poocontroleremoto;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    private final int VOLUME_MAXIMO = 100;
    private final int VOLUME_MINIMO = 0;


    public ControleRemoto() {
        super();
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }


    public ControleRemoto(int volume, boolean ligado, boolean tocando) {
        this.setVolume(volume);
        this.setLigado(ligado);
        this.setTocando(tocando);
    }


    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligarTelevisao() {
        if(!this.isLigado()) {
            System.out.println("Ligando a TV");
            this.setLigado(true);
        } else {
            System.out.println("ERRO! A televisão já está ligada.");
        }
    }

    @Override
    public void desligarTelevisao() {
        if(this.isLigado()) {
            System.out.println("Desligando a TV");
            this.setLigado(false);
        } else {
            System.out.println("ERRO! A televisão já está desligada.");
        }
    }

    @Override
    public void abrirMenu() {
        if(this.isLigado()) {
            System.out.println("Abrindo o menu de opções");
            System.out.println("Está ligada? " + this.isLigado());
            System.out.print("Volume: " + this.getVolume());
            for(int i = 0; i <= this.getVolume(); i+=12) {
                System.out.print(" |");
            }
            System.out.println();
            System.out.println("Está tocando? " + this.isTocando());
        } else {
            System.out.println("ERRO! Não foi possível abrir o menu, pois a televisão está desligada");
        }

    }

    @Override
    public void fecharMenu() {
        if(this.isLigado()) {
            System.out.println("Fechando o Menu de opções");
        } else {
            System.out.println("ERRO! Não foi possível fechar o menu, pois a televisão está desligada");
        }
    }

    @Override
    public void aumentarVolume() {
        if(this.isLigado() && this.getVolume() > VOLUME_MINIMO) {
            this.setVolume(this.getVolume() + 5);
            System.out.println("Aumentando o volume...");
            if(this.getVolume() == VOLUME_MAXIMO) {
                System.out.println("Volume no maximo");
            } else if (this.getVolume() > VOLUME_MAXIMO) {
                this.setVolume(VOLUME_MAXIMO);
                System.out.println("ERRO! Não é mais possível aumentar o volume");
            }
        } else {
            System.out.println("ERRO! Impossível aumentar o volume");
        }
    }

    @Override
    public void abaixarVolume() {
        if(this.isLigado() && this.getVolume() > VOLUME_MINIMO) {
            this.setVolume(this.getVolume() - 5);
            System.out.println("Abaixando o volume...");
            if(this.getVolume() == VOLUME_MINIMO) {
                System.out.println("Volume no mínimo");
            } else if (this.getVolume() > VOLUME_MAXIMO) {
                this.setVolume(VOLUME_MINIMO);
                System.out.println("ERRO! Não é mais possível abaixar o volume");
            }
        } else {
            System.out.println("ERRO! Impossível abaixar o volume");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() > VOLUME_MINIMO) {
            this.setVolume(VOLUME_MINIMO);
        } else {
            System.out.println("ERRO! Impossível colocar a televisão no mudo");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() < VOLUME_MAXIMO) {
            this.setVolume(50);
        } else {
            System.out.println("ERRO! Impossível desligar o mudo");
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        }
    }
}
