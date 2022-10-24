package Questao3Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Questao3.Guerreiro;
import Questao3.Mago;

class PersonagemTest {
	
	private static Guerreiro g1;
	private static Guerreiro g2;
	private static Mago m1;
	private static Mago m2;
	private static Mago m3;
	
	@BeforeAll
	private static void setup () {
		
	List <String> habilidades1 = new ArrayList<>();
	habilidades1.add("Provocar");
	habilidades1.add("Beserker");
	habilidades1.add("Iniciativa");
	
	List <String> habilidades2 = new ArrayList<>();
	habilidades2.add("Beserker");
	habilidades2.add("Provocar");
	
	g1 = new Guerreiro("Aragorn", 300, 20, 333, 10, 60, 3, habilidades1);
	g2 = new Guerreiro("Eddard", 300, 30, 250, 11, 50, 2, habilidades2);
	
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
	void deveInformarQuantidadeDePersonagensCriados() {
		assertEquals(5, m1.qtsPersonagens());
	}

}
