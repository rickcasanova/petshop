package com.ricardocasanova.petshop.entity;

public enum Tipo {

	EMAIL,
	TELEFONE;
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
