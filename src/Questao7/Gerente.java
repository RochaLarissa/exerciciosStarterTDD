package Questao7;

public class Gerente extends Funcionario{

	public Gerente(String Nome, String Funcao, int Idade, double Salario) {
		super(Nome, Funcao, Idade, Salario);		
	}

	@Override
	public double Bonificacao() {
		double bonificacao = getSalario() + 10000;
		return bonificacao;
	}
	

	//adicionei a main a partir daqui
	
	public static void main(String[] args) {

		Gerente gerente = new Gerente("Eduardo", "Gerente", 58, 25000);
		Supervisor supervisor = new Supervisor("Rubens", "Supervisor", 40, 15000);
		Vendedor vendedor = new Vendedor("José", "Vendedor", 37, 9000);
		
		gerente.mostrar();
		supervisor.mostrar();
		vendedor.mostrar();
		
	}

}
