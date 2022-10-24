package Questao7;

public class Vendedor extends Funcionario{

	public Vendedor(String Nome, String Funcao, int Idade, double Salario) {
		super(Nome, Funcao, Idade, Salario);		
	}

	@Override
	public double Bonificacao() {
		double bonificacao = getSalario() + 3000;
		return bonificacao;
	}

}
