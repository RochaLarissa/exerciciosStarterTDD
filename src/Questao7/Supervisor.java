package Questao7;

public class Supervisor extends Funcionario{

	public Supervisor(String Nome, String Funcao, int Idade, double Salario) {
		super(Nome, Funcao, Idade, Salario);		
	}

	@Override
	public double Bonificacao() {
		double bonificacao = getSalario() + 5000;
		return bonificacao;
	}

}
