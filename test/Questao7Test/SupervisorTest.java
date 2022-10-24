package Questao7Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Questao7.Supervisor;

class SupervisorTest {

private static Supervisor supervisor;
	
	@BeforeAll
	private static void setup() {
		supervisor = new Supervisor("Rubens", "Supervisor", 40, 15000);
	}
	
	
	@Test
	void deveVerificarBonificacaoSupervisor() {
		assertEquals(20000, supervisor.Bonificacao());
	}

}
