package Questao3;

import java.util.List;

public class Guerreiro extends Personagem {
	
	private List<String> Habilidade;

	public Guerreiro(String Nome, int Vida, int Mana, float Xp, int Inteligencia, int Forca, int Level, List<String> Habilidade) {
		super(Nome, Vida, Mana, Xp, Inteligencia, Forca, Level);
		this.Habilidade = Habilidade;
	}
	
	

	public List<String> getHabilidade() {
		return Habilidade;
	}



	public void setHabilidade(List<String> habilidade) {
		Habilidade = habilidade;
	}



	@Override
	public void lvlUp() {
		setVida(getVida() + 2 );
		setMana(getMana() + 1 );
		setXp(getXp() + 1);
		setInteligencia(getInteligencia() + 1);
		setForca(getForca() + 2);
		setLevel(getLevel() + 1);
		
		System.out.print("\nGuerreiro " + getNome() + "Subiu para o level " + getLevel() + ".");
	}

	@Override
	public int attack(Personagem p1) {
		int ataque = 0;
		
		int sorteio = (int) Math.random() * 301;		
		ataque = (getForca() * getLevel()) + sorteio;
		
		p1.setVida(p1.getVida() - ataque);
		
		System.out.println("\nGuerreiro " + getNome() + " atacou " + p1.getNome() + ". Dano: " + ataque + ".");
		System.out.println(p1.getNome() + " agora tem " + p1.getVida() + " de vida");
		
		
		return ataque;
	}
	
	public void aprenderHabilidade(String habilidade) {
		Habilidade.add(habilidade);
	}
	
	public void mostrar () {
		System.out.println("\nNome: " + getNome() + "| Vida: " + getVida() + "| Mana: " + getMana() + "| XP: " + getXp() + 
				"| Inteligencia: " + getInteligencia() + "| Força: " +
				getForca() + "| Level: " + getLevel() + "| Habilidades: " + getHabilidade());
	}

}
