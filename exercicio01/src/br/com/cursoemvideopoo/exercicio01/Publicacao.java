package br.com.cursoemvideopoo.exercicio01;

public interface Publicacao {
	public abstract void abrirLivros();
	
	public abstract void fecharLivros();
	
	public abstract void folhearLivros(int pagina);
	
	public abstract void avancarPagina();
	
	public abstract void voltarPagina();
}
