package Questao7;

public abstract class Funcionario {
	
	private String Nome;
	private String Funcao;
	private int Idade;
	private double Salario;
	
	public Funcionario (String Nome, String Funcao, int Idade, double Salario) {
		this.Nome = Nome;
		this.Funcao = Funcao;
		this.Idade = Idade;
		this.Salario = Salario;
	}
	
	
	
	public String getNome() {
		return Nome;
	}



	public void setNome(String nome) {
		Nome = nome;
	}



	public int getIdade() {
		return Idade;
	}



	public void setIdade(int idade) {
		Idade = idade;
	}



	public double getSalario() {
		return Salario;
	}



	public void setSalario(double salario) {
		Salario = salario;
	}


	public String getFuncao() {
		return Funcao;
	}
	
	public void setFuncao(String funcao) {
		funcao = funcao;
	}

	public abstract double Bonificacao() ;
	
	public void mostrar () {
		System.out.println("Nome: " + getNome() + "| Função: " + getFuncao() + "| Idade: " + getIdade() + 
				"| Salário: R$ " + getSalario() + "| Bonificação: R$ " + Bonificacao());
	}




}
