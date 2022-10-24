package Questao2Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Questao2.VideoGame;


class VideoGameTest {

	private VideoGame ps4 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
	private VideoGame ps4Usado = new VideoGame("PS4 Usado", 1000, 7, "Sony", "Slim", true);
	
	
	@Test
	void deveCalcularImpostoVideoGameNovo() {
		assertEquals(810, ps4.calculaImposto());
	}

	@Test
	void deveCalcularImpostoVideoGameUsado() {
		assertEquals(250, ps4Usado.calculaImposto());
	}

}
