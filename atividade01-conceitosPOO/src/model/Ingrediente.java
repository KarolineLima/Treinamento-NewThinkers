package model;

import java.time.LocalDate;

public class Ingrediente {

	private String nome;
	private LocalDate dataDeValidade;

	public Ingrediente(String nome, LocalDate dataDeValidade) {
		this.nome = nome;
		this.dataDeValidade = dataDeValidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDeValidade() {
		return dataDeValidade;
	}

	public void setDataDeValidade(LocalDate dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}

	@Override
	public String toString() {
		return nome
				+ " - Validade: " + dataDeValidade.getDayOfMonth() + "/" 
				+ dataDeValidade.getMonth() + "/" 
				+ dataDeValidade.getYear();
	}

}
