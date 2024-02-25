package br.com.cursoemvideopoo.exercicio01;


public class Exercicio001Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa[] pessoas = new Pessoa[3];
		Livros[] livros = new Livros[3];
		
		pessoas[0] = new Pessoa("Higor Gustavo", "43612567802", "25/10/1997", 'M');
		pessoas[1] = new Pessoa("Vitor Gabriel", "12345678905", "23/03/1996", 'M');
		pessoas[2] = new Pessoa("Margarete Martins", "15821125847", "23/04/1971", 'F');
		
		livros[0] = new Livros("A mente de Adolf HITLER", "Walter Langer", pessoas[0], 265, 58);
		livros[1] = new Livros("Perçy Jackson: A maldição do Titã", "Rick Riordan", pessoas[1], 247, 13);
		livros[2] = new Livros("Harry Potter eo Enigma do Príncipe", "J. k. Rowling", pessoas[2], 471, 350);
		
		livros[0].abrirLivros();
		livros[0].folhearLivros(265);
		livros[0].voltarPagina();
		livros[0].detalheLivro();
		System.out.println("=============================");
		livros[1].detalheLivro();
		System.out.println("=============================");
		livros[2].detalheLivro();
	}

}
