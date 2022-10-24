package Questao7Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Questao7.Vendedor;

class VendedorTest {

	private static Vendedor vendedor;
	
	@BeforeAll
	private static void setup() {
		vendedor = new Vendedor("José", "Vendedor", 37, 9000);
	}
	
	
	@Test
	void deveVerificarBonificacaoVendedor() {
		assertEquals(12000, vendedor.Bonificacao());
	}

}
