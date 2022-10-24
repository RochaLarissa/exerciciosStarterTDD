package Questao7Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Questao7.Gerente;

class GerenteTest {
	
	private static Gerente gerente;
	
	@BeforeAll
	private static void setup() {
		gerente = new Gerente("Eduardo", "Gerente", 58, 25000);
	}
	
	
	@Test
	void deveVerificarBonificacaoGerente() {
		assertEquals(35000, gerente.Bonificacao());
	}

}
