package relacionamentoclasses;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private String categoria;
    private int idade;
    private int vitorias;
    private int derrotas;
    private int empates;
    private double altura;
    private double peso;


    public Lutador() {
        super();
    }


    public Lutador(String nome, String nacionalidade, int idade,
                   int vitorias, int derrotas, int empates, double altura, double peso) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        //this.setCategoria(categoria);
        this.setIdade(idade);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
        this.setAltura(altura);
        this.setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.getPeso() < 52.2 || this.getPeso() > 120.2) {
            this.categoria = "Inválido";
        } else if(this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if(this.getPeso() <= 83.9) {
            this.categoria = "Médio";
        } else {
            this.categoria = "Pesado";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }


    public void apresentarLutador() {
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade() + " anos");
        System.out.println("Altura: " + this.getAltura() + " metros");
        System.out.println("Peso: " + this.getPeso() + " Kg");
        System.out.println("Ganhou: " + this.getVitorias() + " lutas");
        System.out.println("Perdeu: " + this.getDerrotas() + " lutas");
        System.out.println("Empatou: " + this.getEmpates() + " lutas");
    }


    public void statusLutador() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("É da categoria peso: " + this.getCategoria());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }


    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }


    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }


    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

}
