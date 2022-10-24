package Questao3Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Questao3.Mago;

class MagoTest {
	
	private static Mago m1;
	private static Mago m2;
	private static Mago m3;
	
	@BeforeAll
	private static void setup () {
		List <String> magia1 = new ArrayList<>();
		magia1.add("Bola de Fogo");
		magia1.add("Curaga");
		
		List <String> magia2 = new ArrayList<>();
		magia2.add("Crucius");
		magia2.add("Curaga");
		
		List <String> magia3 = new ArrayList<>();
		magia3.add("Imperius");
		
		m1 = new Mago("Gandalf", 300, 150, 15, 45, 40, 3, magia1);
		m2 = new Mago("Elminster", 300, 100, 66, 50, 39, 3, magia2);
		m3 = new Mago("Dumbledore", 300, 80, 20, 70, 35, 2, magia3);
	}
	
	
	@Test
	void deveUparLevel() {
		m1.lvlUp();
		m2.lvlUp();
		m3.lvlUp();
		
		assertEquals(4, m1.getLevel());
		assertEquals(4, m2.getLevel());
		assertEquals(3, m3.getLevel());
	}
	
	@Test
	void deveAprenderHabilidade() throws Exception {
		m1.aprenderMagia("Cura Acelerada");

		assertEquals(3, m1.getMagia().size());
	}
	
	@Test
	void deveVerificarAtaqueDoMago() throws Exception {
		int min = m1.getInteligencia() * m1.getLevel();
		int max = min + 300;
		
		assertTrue(m1.attack(m2) >= min && m1.attack(m2) <= max);
	}
	

}
