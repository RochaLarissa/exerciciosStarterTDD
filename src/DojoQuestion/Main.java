package DojoQuestion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numero = 0;
				
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe um numero para saber os seus fatores primos");
		numero = s.nextInt();
	
        for (Integer inteiro : FatoresPrimos.FatoresPrimos(numero)) {
            System.out.print(inteiro + " ");
        }
				
		s.close();

	}

}
