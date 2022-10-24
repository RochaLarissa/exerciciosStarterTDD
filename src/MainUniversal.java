import java.util.Scanner;

import Questao1.Veiculo;
import Questao2.Livro;
import Questao3.Mago;
import Questao7.Gerente;

public class MainUniversal {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int opcaoEscolhida = 0;

		System.out.println("Informe o número da questão que deseja resolver: [1], [2], [3] ou [7].");
		opcaoEscolhida = s.nextInt();

		switch (opcaoEscolhida) {
		case 1: {
			System.out.println("Questão 1 escolhida");
			Veiculo v1 = new Veiculo(null, null, null, null, opcaoEscolhida, false, opcaoEscolhida, opcaoEscolhida,
					opcaoEscolhida);
			v1.main(args);

			break;
		}
		case 2: {
			System.out.println("Questão 2 escolhida");
			Livro l1 = new Livro(null, opcaoEscolhida, opcaoEscolhida, null, null, opcaoEscolhida);
			l1.main(args);

			break;
		}
		case 3: {
			System.out.println("Questão 3 escolhida");
			Mago m1 = new Mago(null, opcaoEscolhida, opcaoEscolhida, opcaoEscolhida, opcaoEscolhida, opcaoEscolhida,
					opcaoEscolhida, null);
			m1.main(args);

			break;

		}
		case 7: {
			System.out.println("Questão 7 escolhida");
			Gerente g1 = new Gerente(null, null, opcaoEscolhida, opcaoEscolhida);
			g1.main(args);

			break;

		}
		default:
			System.out.println(
					"Informe o número da questão que deseja resolver: [1], [2], [3] ou [7].");
			opcaoEscolhida = s.nextInt();
		}

	}

}
