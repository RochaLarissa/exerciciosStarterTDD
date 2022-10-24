package Questao1;

import Questao1.ImpossivelDesligarCarroemMovimentoException;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;
	
	public Veiculo (String marca, String modelo, String placa, String cor, float km, boolean isLigado, 
			int litrosCombustivel, int velocidade, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	public void acelerar() {
		if (!isLigado) {
			throw new ImpossivelAcelerarCarroDesligadoException();
		} else {
			velocidade = velocidade + 20;
			System.out.println("Acelerou");			
		}
		
	}
	
	public void abastecer(int combustivel) {
		if (litrosCombustivel + combustivel > 60) {
			throw new LimiteDoTanqueAtingidoException();
		} else {
			litrosCombustivel = litrosCombustivel + combustivel;
		}
	}
	
	public void frear() {
		if (velocidade >= 20) {
			velocidade = velocidade - 20;
		} else if (velocidade < 20 && velocidade > 0) {
			velocidade = 0;
		}else {
			throw new ImpossivelFrearCarroParadoException();
		}
	}
	
	public void pintar(String Cor) {
		cor = Cor;
	}
	
	public void ligar() {
		if (!isLigado) {
			isLigado = true;
		}
	}
	
	public void desligar() {
		if (velocidade <= 0) {
			isLigado = false;
		} else {
			throw new ImpossivelDesligarCarroemMovimentoException();
		}
	}
	
	public void mostrar () {
		System.out.println("\nMarca:" + marca + "| Modelo: " + modelo + "| Placa: " + placa + "| Cor: " + cor + 
				"| Kilometragem: " + km + "| Está ligado: " + isLigado + "| Tanque: " + litrosCombustivel + 
				"| Velocidade: " + velocidade + "| Preço: " + preco);
	}

	//adicionei a main a partir daqui
	
	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo ("Wolkswagen", "Gol", "OSB0987", "Prata",
				580000, true, 25, 45, 32000);
		System.out.println("\nCarro criado com sucesso!\n");
		
		v1.mostrar();
		
		//testando acelerar
		System.out.println("\nAcelerando!!!");
		v1.acelerar();
		System.out.println("Velocidade atual: " + v1.getVelocidade());
				
		//testando abastecer
		System.out.println("\nHora de abastecer. Mais 30L no tanque!");
		v1.abastecer(30);
		System.out.println("Tanque: " + v1.getLitrosCombustivel());
				
		//testando frear
		System.out.println("\nFreando!!!");
		v1.frear();
		System.out.println("Velocidade atual: " + v1.getVelocidade());
		
		//testando pintar
		System.out.println("\nVamos dar uma repaginada? Carro prata agora será preto!");
		v1.pintar("Preto");
		System.out.println("Cor do carro: " + v1.getCor());
		
		//testando ligar
		System.out.println("\nLigando!!!");
		v1.ligar();
		System.out.println("O carro esta ligado? " + v1.isLigado());
		
		//testando desligar
		System.out.println("\nDesligando!!!");
		v1.setVelocidade(0);
		v1.desligar();
		System.out.println("O carro esta ligado? " + v1.isLigado());

		v1.mostrar();
		
	}
	
	
	
}
