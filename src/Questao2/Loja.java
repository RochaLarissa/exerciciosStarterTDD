package Questao2;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	
	private String nome;
	private String cnpj;
	private List <Livro> livros;
	private List <VideoGame> videoGames;
	
	public Loja (String nome, String cnpj, List <Livro> livros, List <VideoGame> videoGames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(ArrayList<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}
	
	public void listaLivros() {
		if (livros.isEmpty()) {
			System.out.println("\nA loja não tem livros no seu estoque.");
		} else {
			System.out.println("\nA loja " + nome + "possui estes livros para venda:");
			for (int i = 0; i < livros.size(); i++) {
				livros.get(i).mostra();
			    }
		}
	}
	
	public void listaVideoGames() {
		if (videoGames.isEmpty()) {
			System.out.println("\nA loja não tem video-games no seu estoque.");
		} else {
			System.out.println("\nA loja " + nome + "possui estes video-games para venda:");
			for (int i = 0; i < videoGames.size(); i++) {
			    	videoGames.get(i).mostra();
			    }
		}
	}

	public double calculaPatrimonio() {
		double preco = 0;
		if (videoGames.isEmpty() && !livros.isEmpty()) {
			for (int i = 0; i < livros.size(); i++) {
				preco = preco + (livros.get(i).getPreco() * livros.get(i).getQtd());
			}
		} 
		
		else if (!videoGames.isEmpty() && livros.isEmpty()) {
			preco = 0;
			for (int i = 0; i < videoGames.size(); i++) {
				preco = preco + (videoGames.get(i).getPreco() * videoGames.get(i).getQtd());
			}
		}
		
		else if (!videoGames.isEmpty() && !livros.isEmpty()) {
			preco = 0;
			for (int i = 0; i < livros.size(); i++) {
				preco = preco + (livros.get(i).getPreco() * livros.get(i).getQtd());
			}for (int i = 0; i < videoGames.size(); i++) {
				preco = preco + (videoGames.get(i).getPreco() * videoGames.get(i).getQtd());
			}
		}
				
			
		System.out.println("\nO patrimonio total da loja " + getNome() + " equivale a R$ " + preco);
		return preco;
	}

}
