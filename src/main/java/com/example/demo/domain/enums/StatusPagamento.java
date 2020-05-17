package com.example.demo.domain.enums;

public enum StatusPagamento {

	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANNCELADO(3, "Cancelado");
	
	private int cod;
	private String descricao;
	
	private StatusPagamento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static StatusPagamento toEnum(Integer cod) {

		if (cod == null)
			return null;

		for (StatusPagamento s : StatusPagamento.values()) {
			if (cod.equals(s.getCod()))
				return s;
		}

		throw new IllegalArgumentException("Codigo inválido: " + cod);
	}
	
	
	
	
	
}
