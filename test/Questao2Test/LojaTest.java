package Questao2Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Questao2.Livro;
import Questao2.Loja;
import Questao2.VideoGame;

class LojaTest {
	
	private static Loja americanas;
	private static Loja casasBahia;
	private static Loja livrariaLeitura;
	private static Loja lojaNova;
	
	@BeforeAll
	public static void setup() {
		
	Livro l1 = new Livro("Harry Potter", 40, 50, "J. K. Rolling", "fantasia", 300);
	Livro l2 = new Livro("Senhor dos Anéis", 60, 30, "J. R. R. Tolkien", "fantasia", 500);
	Livro l3 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);

	VideoGame ps4 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
	VideoGame ps4Usado = new VideoGame("PS4 Usado", 1000, 7, "Sony", "Slim", true);
	VideoGame xbox = new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false);

	List <Livro> livrosVazio = new ArrayList<>();
	List <Livro> livros = new ArrayList<>();
	livros.add(l1);
	livros.add(l2);
	livros.add(l3);

	List<VideoGame> gamesVazio = new ArrayList<>();
	List<VideoGame> games = new ArrayList<>();
	games.add(ps4);
	games.add(ps4Usado);
	games.add(xbox);

	americanas = new Loja("Americanas", "12345678", livros, games);
	casasBahia = new Loja("Casas Bahia", "87654321", livrosVazio, games);
	livrariaLeitura = new Loja("Livraria Leitura", "1111111", livros, gamesVazio);
	lojaNova = new Loja("Loja Nova", "2222222", livrosVazio, gamesVazio);
	}

	@Test
	void deveCalcularPatrimonio() {
		assertEquals(941800, americanas.calculaPatrimonio());
	}
	
	@Test
	void deveCalcularPatrimonioDeLojaSemLivros() {
		assertEquals(937000, casasBahia.calculaPatrimonio());
	}

	@Test
	void deveCalcularPatrimonioDeLojaSemVideoGames() {
		assertEquals(4800, livrariaLeitura.calculaPatrimonio());
	}

	@Test
	void deveCalcularPatrimonioDeLojaSemPatrimonio() {
		assertEquals(0, lojaNova.calculaPatrimonio());
	}
	
	@Test
	void deveVerificarTamanhoDaListaDeLivros() throws Exception {
		assertEquals(3, americanas.getLivros().size());
		assertEquals(0, casasBahia.getLivros().size());
	}
	
	@Test
	void deveVerificarTamanhoDaListaDeVideoGames() throws Exception {
		assertEquals(3, americanas.getVideoGames().size());
		assertEquals(0, livrariaLeitura.getVideoGames().size());
	}
	
	
}
