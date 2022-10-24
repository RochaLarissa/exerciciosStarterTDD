package Questao3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List <String> habilidades1 = new ArrayList<>();
		habilidades1.add("Provocar");
		habilidades1.add("Beserker");
		habilidades1.add("Iniciativa");
		List <String> habilidades2 = new ArrayList<>();
		habilidades2.add("Beserker");
		habilidades2.add("Provocar");
		
		List <String> magia1 = new ArrayList<>();
		magia1.add("Bola de Fogo");
		magia1.add("Curaga");
		List <String> magia2 = new ArrayList<>();
		magia2.add("Crucius");
		magia2.add("Curaga");
		List <String> magia3 = new ArrayList<>();
		magia3.add("Imperius");
		
		Guerreiro g1 = new Guerreiro("Aragorn", 300, 20, 333, 10, 60, 3, habilidades1);
		Guerreiro g2 = new Guerreiro("Eddard", 300, 30, 250, 11, 50, 2, habilidades2);
		
		/*String Nome, int Vida, int Mana, float Xp, int Inteligencia, int Forca, int Level, List<String> Magia*/
		Mago m1 = new Mago("Gandalf", 300, 150, 15, 45, 40, 3, magia1);
		Mago m2 = new Mago("Elminster", 300, 100, 66, 50, 39, 3, magia2);
		Mago m3 = new Mago("Dumbledore", 300, 80, 20, 70, 35, 2, magia3);
		
		g1.mostrar();
		g2.mostrar();
		m1.mostrar();
		m2.mostrar();
		m3.mostrar();
		
		g1.lvlUp();
		g2.lvlUp();
		m1.lvlUp();
		m2.lvlUp();
		m3.lvlUp();
		
		g1.attack(g2);
		g2.attack(g1);
		
		m1.attack(m2);
		m2.attack(m3);
		m3.attack(m1);
		
		
		//quantidade de personagens criados
		g1.qtsPersonagens();
	}

}
