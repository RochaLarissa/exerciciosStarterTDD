package Questao3;

import java.util.ArrayList;
import java.util.List;

public class Mago extends Personagem{
	
	private List<String> Magia;

	public Mago(String Nome, int Vida, int Mana, float Xp, int Inteligencia, int Forca, int Level, List<String> Magia) {
		super(Nome, Vida, Mana, Xp, Inteligencia, Forca, Level);
		this.Magia = Magia;
	}
	
	

	public List<String> getMagia() {
		return Magia;
	}



	public void setMagia(List<String> magia) {
		Magia = magia;
	}



	@Override
	public void lvlUp() {
		setVida(getVida() + 2 );
		setMana(getMana() + 2 );
		setXp(getXp() + 1);
		setInteligencia(getInteligencia() + 2);
		setForca(getForca() + 1);
		setLevel(getLevel() + 1);
		System.out.print("\nMago " + getNome() + "Subiu para o level " + getLevel() + ".");
	}

	@Override
	public int attack(Personagem p1) {
		int ataque = 0;
		
		int sorteio = (int) Math.random() * 301;		
		ataque = (getInteligencia() * getLevel()) + sorteio;
		
		p1.setVida(p1.getVida() - ataque);
		
		System.out.println("\nMago " + getNome() + " atacou " + p1.getNome() + ". Dano: " + ataque + ".");
		System.out.println(p1.getNome() + " agora tem " + p1.getVida() + " de vida");
		
		
		return ataque;
	}
	
	
	public void aprenderMagia(String magia) {
		Magia.add(magia);
	}
	
	public void mostrar () {
		System.out.println("\nNome: " + getNome() + "| Vida: " + getVida() + "| Mana: " + getMana() + "| XP: " + getXp() + 
				"| Inteligencia: " + getInteligencia() + "| Força: " +
				getForca() + "| Level: " + getLevel() + "| Magia: " + getMagia());
	}


	//adicionei a Main a partir daqui
	
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
