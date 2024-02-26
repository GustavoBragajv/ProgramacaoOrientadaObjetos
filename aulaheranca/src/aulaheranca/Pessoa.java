package aulaheranca;


import java.util.Calendar;

public class Pessoa {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private char sexo;
    private int idade;


    public Pessoa() {
        super();
    }


    public Pessoa(String nome, String cpf, String dataNascimento, char sexo) {
        super();
        this.setNome(nome);
        this.setCpf(cpf);
        this.setDataNascimento(dataNascimento);
        this.setSexo(sexo);
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


    public String getDataNascimento() {
        return dataNascimento;
    }


    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public char getSexo() {
        return sexo;
    }


    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    public int getIdade() {
        fazerAniversario();
        return this.idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void fazerAniversario() {
        Calendar dataAtual = Calendar.getInstance();
        int anoAtual = dataAtual.get(Calendar.YEAR);
        int mesAtual = dataAtual.get(Calendar.MONTH) + 1;
        int diaAtual = dataAtual.get(Calendar.DATE);

        String diaNascimento = dataNascimento.substring(0, 2);

        String mesNascimento = dataNascimento.substring(3, 5);

        String anoNascimento = dataNascimento.substring(6, 10);

        int ano = Integer.parseInt(anoNascimento);
        int mes = Integer.parseInt(mesNascimento);
        int dia = Integer.parseInt(diaNascimento);
        this.setIdade(anoAtual - ano);

        if(diaAtual == dia && mesAtual == mes) {
                System.out.println("PARABÉNS hoje é seu aniversário...");
        }
    }
    
    
    public void infoPessoa() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Data Nascimento: "  + this.getDataNascimento());
        System.out.println("Idade: " + this.getIdade() + " anos");
        System.out.println("Sexo: " + this.getSexo());
    }
    
	
}

