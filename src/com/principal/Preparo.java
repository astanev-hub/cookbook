package com.principal;

public class Preparo {
	String descricao;

	public Preparo(String descricao) {
		super();
		this.descricao = descricao;
	}
	
	private void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return "\n\t" + descricao.toString();
	}	
	
	public void alteraDescricao(String descricao) {
		setDescricao(descricao);
	}
	
}
