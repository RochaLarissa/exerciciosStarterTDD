package Questao1Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Questao1.ImpossivelAcelerarCarroDesligadoException;
import Questao1.ImpossivelDesligarCarroemMovimentoException;
import Questao1.ImpossivelFrearCarroParadoException;
import Questao1.LimiteDoTanqueAtingidoException;
import Questao1.Veiculo;

class VeiculoTest {

	private Veiculo veiculo;

	@BeforeEach
	public void setup() {
		veiculo = new Veiculo("Wolkswagen", "Gol", "OSB0987", "Prata", 580000, true, 25, 45, 32000);
	}

	@Test
	void deveAcelerarCarroLigado() throws Exception {
		veiculo.acelerar();
		
		assertEquals(65, veiculo.getVelocidade());
	}
	
	@Test
	void naoDeveAcelerarCarroDesligado() throws Exception {
		veiculo.setVelocidade(0);
		veiculo.desligar();
		
		assertThrows(ImpossivelAcelerarCarroDesligadoException.class, () -> {
			veiculo.acelerar();
		});
	}

	@Test
	void deveAbastecer() throws Exception {
		veiculo.abastecer(30);

		assertEquals(55, veiculo.getLitrosCombustivel());
	}

	@Test()
	void naoDeveAbastecerAcimaDoLimiteDoTanque() throws Exception {
		assertThrows(LimiteDoTanqueAtingidoException.class, () -> {
			veiculo.abastecer(50);
		});
	}

	@Test
	void deveFrear() throws Exception {
		veiculo.frear();

		assertEquals(25, veiculo.getVelocidade());
	}
	
	@Test
	void naoDeveFrearCarroParado() throws Exception {
		veiculo.setVelocidade(0);
		
		assertThrows(ImpossivelFrearCarroParadoException.class, () -> {
			veiculo.frear();
		});
	}

	@Test
	void devePararCarroComMenosDe20KmPorHora() throws Exception {
		veiculo.setVelocidade(20);
		veiculo.frear();

		assertEquals(0, veiculo.getVelocidade());
	}

	@Test
	void devePintarCarro() throws Exception {
		veiculo.pintar("Preto");

		assertEquals("Preto", veiculo.getCor());
	}

	@Test
	void deveLigar() throws Exception {
		veiculo.ligar();

		assertEquals(true, veiculo.isLigado());
	}

	@Test
	void deveDesligarCarroParado() throws Exception {
		veiculo.setVelocidade(0);
		veiculo.desligar();

		assertEquals(false, veiculo.isLigado());
	}

	@Test
	void naoDeveDesligarCarroEmMovimento() throws Exception {	
		assertThrows(ImpossivelDesligarCarroemMovimentoException.class, () -> {
			veiculo.desligar();
		});
	}
}
