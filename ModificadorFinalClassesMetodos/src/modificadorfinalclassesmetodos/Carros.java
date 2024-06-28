package modificadorfinalclassesmetodos;

public class Carros {
    private String marca;
    private String modelo;
    private static final int VELOCIDADE_LIMITE = 250; // Constante
    private static final Comprador COMPRADOR = new Comprador();
    
    // Variáveis de referência final não podemos alterar os objetos
    
    public Carros() {
        super();
    }
    
    public Carros(String marca, String modelo) {
        super();
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carro{");
        sb.append("marca=").append(marca);
        sb.append(", modelo=").append(modelo);
        sb.append('}');
        return sb.toString();
    }
}
