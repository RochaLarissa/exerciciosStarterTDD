package Questao2Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Questao2.Livro;


class LivroTest {

	private Livro l1 = new Livro("Harry Potter", 40, 50, "J. K. Rolling", "fantasia", 300);
	private Livro l2 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);
	
	
	@Test
	void deveCalcularImpostoLivro() {
		assertEquals(4, l1.calculaImposto());
	}
	
	@Test
	void deveCalcularImpostoLivroEducativo() {
		assertEquals(0, l2.calculaImposto());
	}

}
