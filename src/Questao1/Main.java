package Questao1;

public class Main {

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
		v1.desligar();
		System.out.println("O carro esta ligado? " + v1.isLigado());

		v1.mostrar();
		
	}

}
