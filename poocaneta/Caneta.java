package poocaneta;

public class Caneta {
    private String modelo;
    private String cor;
    private double ponta;
    private int carga;
    private boolean tampada;


    public Caneta() {
        super();
    }


    public Caneta(String modelo, String cor, double ponta, int carga) {
        this.setModelo(modelo);
        this.setCor(cor);
        this.setPonta(ponta);
        this.setCarga(carga);
        this.tampada = false;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }


    public void rabiscar() {
        if(!this.isTampada()) {
            System.out.println("Rabiscando");
        } else {
            System.out.println("ERRO! Impossível rabiscar com a caneta tampada");
        }
    }


    public void tamparCaneta() {
        if(!this.isTampada()) {
            System.out.println("Tampando a caneta");
            this.setTampada(true);
        } else {
            System.out.println("ERRO! A caneta já está tampada");
        }

    }


    public void destamparCaneta() {
        if(this.isTampada()) {
            System.out.println("Destampando a caneta");
            this.setTampada(false);
        } else {
            System.out.println("ERRO! A caneta já está destampada");
        }
    }


    public void statusCaneta() {
        System.out.println("Informações da poocaneta.Caneta");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Carga: " + this.getCarga());
        System.out.println("Está tampada? " + this.isTampada());
    }
}
