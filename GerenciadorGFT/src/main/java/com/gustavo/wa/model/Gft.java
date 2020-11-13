package com.gustavo.wa.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Gft {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy = "gft")
	private List<Funcionario> funcionarios;
	
	private String cep;
	
	private String cidade;
	
	private String endereco;
	
	private String estado;
	
	private String nome;
	
	private String telefone;
	
	
	public Gft() {
		
	}
	public Gft(Long id, String cep, String cidade, String endereco, String estado,
			String nome, String telefone) {
		super();
		this.id = id;		
		this.cep = cep;
		this.cidade = cidade;
		this.endereco = endereco;
		this.estado = estado;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
