package Questao3;

public abstract class Personagem {
	
	private String Nome;
	private int Vida;
	private int Mana;
	private float Xp;
	private int Inteligencia;
	private int Forca;
	private int Level;
	private static int qtdPersonagens = 0;
	
	public Personagem (String Nome, int Vida, int Mana, float Xp, int Inteligencia,
			int Forca, int Level) {
		this.Nome = Nome;
		this.Vida = Vida;
		this.Mana = Mana;
		this.Xp = Xp;
		this.Inteligencia = Inteligencia;
		this.Forca = Forca;
		this.Level = Level;
		Personagem.qtdPersonagens++;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getVida() {
		return Vida;
	}

	public void setVida(int vida) {
		Vida = vida;
	}

	public int getMana() {
		return Mana;
	}

	public void setMana(int mana) {
		Mana = mana;
	}

	public float getXp() {
		return Xp;
	}

	public void setXp(float xp) {
		Xp = xp;
	}

	public int getInteligencia() {
		return Inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		Inteligencia = inteligencia;
	}

	public int getForca() {
		return Forca;
	}

	public void setForca(int forca) {
		Forca = forca;
	}

	public int getLevel() {
		return Level;
	}

	public void setLevel(int level) {
		Level = level;
	}
	
	public abstract void lvlUp();
	
	public abstract int attack(Personagem p1);
	
	public int qtsPersonagens () {
		System.out.println("O total de personagens criados foi: " + qtdPersonagens);
		return qtdPersonagens;
	}

}
