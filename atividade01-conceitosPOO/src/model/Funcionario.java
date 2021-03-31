package model;

public class Funcionario {

	
	private String nome;
	private EnumFuncionario tipo;
	public Funcionario(String nome, EnumFuncionario tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public EnumFuncionario getTipo() {
		return tipo;
	}
	public void setTipo(EnumFuncionario tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", tipo=" + tipo + "]";
	}
	
	
}
