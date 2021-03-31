package model;

public class Funcionario {

	private String nome;
	private EnumFuncionario atividade;

	public Funcionario(String nome, EnumFuncionario atividade) {
		this.nome = nome;
		this.atividade = atividade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EnumFuncionario getatividade() {
		return atividade;
	}

	public void setatividade(EnumFuncionario atividade) {
		this.atividade = atividade;
	}

	@Override
	public String toString() {
		return  nome + " - " + atividade;
	}

}
