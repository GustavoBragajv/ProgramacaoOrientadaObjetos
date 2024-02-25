package br.com.cursoemvideopoo.exercicio01;

public class Livros implements Publicacao{
	
	private String titulo;
	private String autor;
	private Pessoa leitor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	
	
	public Livros() {
		super();
	}
	
	
	public Livros(String titulo, String autor, Pessoa leitor, int totPaginas, int pagAtual) {
		super();
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setLeitor(leitor);
		this.setTotPaginas(totPaginas);
		this.setPagAtual(pagAtual);
		this.setAberto(false);
	}


	public String getTitulo() {
		return titulo;
	}
	
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	public String getAutor() {
		return autor;
	}
	
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	public Pessoa getLeitor() {
		return leitor;
	}
	
	
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	
	public int getTotPaginas() {
		return totPaginas;
	}
	
	
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	
	
	public int getPagAtual() {
		return pagAtual;
	}
	
	
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	
	
	public boolean isAberto() {
		return aberto;
	}
	
	
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	
	public void detalheLivro() {
		System.out.print("Titulo: " + this.getTitulo());
		System.out.println(", Autor: " + this.getAutor());
		System.out.print("Total de páginas: " + this.getTotPaginas());
		System.out.println(", Página Atual: " + this.getPagAtual());
		System.out.print("Leitor: " + this.getLeitor().getNome());
		System.out.print(", Idade: " + this.getLeitor().getIdade());
		System.out.println(", Sexo: " + this.getLeitor().getSexo());
	}


	@Override
	public String toString() {
		return "Livros [titulo=" + titulo + ", autor=" + autor + ", leitor=" + leitor.getNome() + ", totPaginas=" + totPaginas
				+ ", pagAtual=" + pagAtual + ", aberto=" + aberto + "]";
	}


	@Override
	public void abrirLivros() {
		// TODO Auto-generated method stub
		this.aberto = true;
	}


	@Override
	public void fecharLivros() {
		// TODO Auto-generated method stub
		this.aberto = false;
	}


	@Override
	public void folhearLivros(int pagina) {
		// TODO Auto-generated method stub
		if(pagina > this.totPaginas || pagina < 0) {
			System.out.println("ERRO! Está pagina não existe, voltando para pagina 0");
			this.setPagAtual(0);
		} else {
			this.setPagAtual(pagina);
		}
	}


	@Override
	public void avancarPagina() {
		// TODO Auto-generated method stub
		if(this.isAberto()) {
			if(this.getTotPaginas() < this.getPagAtual()) {
				this.pagAtual++;
			} else {
				System.out.println("ERRO! Você já chegou ao fim do livro.");
			}
		} else {
			System.out.println("ERRO! Impossível avançar a pagina com o livro fechado.");
		}
	}


	@Override
	public void voltarPagina() {
		// TODO Auto-generated method stub
		if(this.isAberto()) {
			if(this.getPagAtual() > 0) {
				this.pagAtual--;
			} else {
				System.out.println("ERRO! Você já volto ao começo do livro.");
			}
		} else {
			System.out.println("ERRO! Impossível voltar a pagina com o livro fechado.");
		}
	}

}
