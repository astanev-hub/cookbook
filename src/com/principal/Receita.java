package com.principal;

import java.util.Arrays;

public class Receita {
	
	private int id;
	private String nome;
	private Categoria categoria;
	private double tempoDePreparo;
	private Rendimento rendimento;
	private Ingredientes[] ingrediente = new Ingredientes[5];
	private Preparo[] preparo = new Preparo[5];
	
	public Receita(int id,String nome, Categoria categoria, double tempoDePreparo, Rendimento rendimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.tempoDePreparo = tempoDePreparo;
		this.rendimento = rendimento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public void setTempoDePreparo(double tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}

	public void setRendimento(Rendimento rendimento) {
		this.rendimento = rendimento;
	}

	public void setIngrediente(Ingredientes[] ingrediente) {
		this.ingrediente = ingrediente;
	}

	public void setPreparo(Preparo[] preparo) {
		this.preparo = preparo;
	}

	@Override
	public String toString() {
		return "Receita:\t" + id + "\nNome:\t\t" + nome + "\nCategoria:\t" + categoria + "\nTempo Preparo:\t"
				+ tempoDePreparo + " Minutos" + "\nRendimento:\t" + rendimento + "\nIngredientes: " 
				+ Arrays.toString(ingrediente).replaceAll("[\\[\\]{}\\,]","")
				+ "\nModo de Preparo: " + Arrays.toString(preparo).replaceAll("[\\[\\](){}\\,]","");
	}

	
}
