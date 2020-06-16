package com.nelioalves.cursomc.dto;

import com.nelioalves.cursomc.domain.Cidade;

public class CidadeDTO {

	private int id;
	
	private String nome;
	
	public CidadeDTO() {
		
	}

	public CidadeDTO(Cidade cidade) {
		this.id = cidade.getId();
		this.nome = cidade.getNome();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
