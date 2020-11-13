package com.gustavo.wa.model;

public enum Cargo {
	
	ANALISTA ("Analista de sistemas"),
	BACK ("Desenvolvedor back-end"),
	FRONT ("Desenvolvedor front-end");
	
	private String descricao;
	
	Cargo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
