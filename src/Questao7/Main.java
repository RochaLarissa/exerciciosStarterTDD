package Questao7;

public class Main {

	public static void main(String[] args) {

		Gerente gerente = new Gerente("Eduardo", "Gerente", 58, 25000);
		Supervisor supervisor = new Supervisor("Rubens", "Supervisor", 40, 15000);
		Vendedor vendedor = new Vendedor("José", "Vendedor", 37, 9000);
		
		gerente.mostrar();
		supervisor.mostrar();
		vendedor.mostrar();
		
		
		
		
	}

}
