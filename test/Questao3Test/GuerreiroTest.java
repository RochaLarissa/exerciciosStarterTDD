package Questao3Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Questao3.Guerreiro;

class GuerreiroTest {
	
	private static Guerreiro g1;
	private static Guerreiro g2;
	
	@BeforeAll
	private static void setup () {
		
	List <String> habilidades1 = new ArrayList<>();
	habilidades1.add("Provocar");
	habilidades1.add("Beserker");
	habilidades1.add("Iniciativa");
	
	List <String> habilidades2 = new ArrayList<>();
	habilidades2.add("Beserker");
	habilidades2.add("Provocar");
	
	g1 = new Guerreiro("Aragorn", 8, 20, 333, 10, 60, 3, habilidades1);
	g2 = new Guerreiro("Eddard", 7, 30, 250, 11, 50, 2, habilidades2);
	}
	

	@Test
	void deveUparLevel() {
		g1.lvlUp();
		g2.lvlUp();
		
		assertEquals(4, g1.getLevel());
		assertEquals(3, g2.getLevel());
	}
	
	@Test
	void deveAprenderHabilidade() throws Exception {
		g1.aprenderHabilidade("Atropelar");

		assertEquals(4, g1.getHabilidade().size());
	}
	
	@Test
	void deveVerificarAtaqueDoGuerreiro() throws Exception {
		int min = g1.getForca() * g1.getLevel();
		int max = min + 300;
		
		assertTrue(g1.attack(g2) >= min && g1.attack(g2) <= max);
	}

}
