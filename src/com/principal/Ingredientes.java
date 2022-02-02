package com.principal;

public class Ingredientes {
	private String nome;
	private double quantidade;
	private Tipo tipo;
	
	public Ingredientes(String nome, double quantidade, Tipo tipo) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.tipo = tipo;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	private void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "\n\t" + nome + " (" + quantidade + " " + tipo + ")";
	}
	
	public void alteraIngredientes(String nome, double quantidade, Tipo tipo) {
		setNome(nome);
		setQuantidade(quantidade);
		setTipo(tipo);
	}
}
