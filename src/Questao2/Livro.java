package Questao2;

import java.util.ArrayList;
import java.util.List;

public class Livro extends Produto implements Imposto {

	private String autor;
	private String tema;
	private int qtdPag;

	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}

	@Override
	public double calculaImposto() {
		double imposto = 0;
		if (tema.equalsIgnoreCase("educativo")) {
			imposto = 0;
			System.out.println("Livro educativo não tem imposto: " + getNome() + ".");
		} else {
			imposto = 0.1 * getPreco();
			System.out.println("R$ " + imposto + " de imposto sobre o livro " + getNome() + ".");
		}
		return imposto;
	}
	
	@Override
	public void mostra() {
		System.out.println("Nome: " + getNome() + "| Preço: " + getPreco() + "| Quantidade: " + getQtd() + 
				"| Autor: " + autor + "| Tema: " + tema + "| Paginas: " + qtdPag);
	}
	
	
	//adicionei a main a partir daqui
	
	public static void main(String[] args) {

		Livro l1 = new Livro("Harry Potter", 40, 50, "J. K. Rolling", "fantasia", 300);
		Livro l2 = new Livro("Senhor dos Anéis", 60, 30, "J. R. R. Tolkien", "fantasia", 500);
		Livro l3 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);

		VideoGame ps4 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
		VideoGame ps4Usado = new VideoGame("PS4 Usado", 1000, 7, "Sony", "Slim", true);
		VideoGame xbox = new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false);

		List<Livro> livros = new ArrayList<>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);

		List<VideoGame> games = new ArrayList<>();
		games.add(ps4);
		games.add(ps4Usado);
		games.add(xbox);

		Loja americanas = new Loja("Americanas", "12345678", livros, games);

		l2.calculaImposto();
		l3.calculaImposto();

		ps4Usado.calculaImposto();
		ps4.calculaImposto();

		americanas.listaLivros();
		americanas.listaVideoGames();
		americanas.calculaPatrimonio();

	}
	

}


