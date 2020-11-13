package com.gustavo.wa.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Vaga {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy = "vaga")
	private List<Funcionario> funcionarios;
	
	private String aberturaVaga;
	
	private String nomeVaga;
	
	private Integer codigoVaga;
	
	private String descricaoVaga;
	
	private String projeto;
	
	private Integer qtdVaga;
	
	@ManyToMany
	@JoinTable(name = "vaga_tecnologia", joinColumns = @JoinColumn(name = "id"),
	inverseJoinColumns = @JoinColumn(name = "tecnologia_id"))
	private List<Tecnologia> tecnologia;
	
	
	public List<Tecnologia> getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(List<Tecnologia> tecnologia) {
		this.tecnologia = tecnologia;
	}

	public Vaga() {
		
	}
	
	

	public Vaga(Long id, String aberturaVaga, String nomeVaga, Integer codigoVaga,
			String descricaoVaga, String projeto, Integer qtdVaga, List<Tecnologia> tecnologia) {
		super();
		this.id = id;
		this.aberturaVaga = aberturaVaga;
		this.nomeVaga = nomeVaga;
		this.codigoVaga = codigoVaga;
		this.descricaoVaga = descricaoVaga;
		this.projeto = projeto;
		this.qtdVaga = qtdVaga;
		this.tecnologia = tecnologia;
	}

	public String getNomeVaga() {
		return nomeVaga;
	}
	public void setNomeVaga(String nomeVaga) {
		this.nomeVaga = nomeVaga;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAberturaVaga() {
		return aberturaVaga;
	}
	public void setAberturaVaga(String aberturaVaga) {
		this.aberturaVaga = aberturaVaga;
	}
	public Integer getCodigoVaga() {
		return codigoVaga;
	}
	public void setCodigoVaga(Integer codigoVaga) {
		this.codigoVaga = codigoVaga;
	}
	public String getDescricaoVaga() {
		return descricaoVaga;
	}
	public void setDescricaoVaga(String descricaoVaga) {
		this.descricaoVaga = descricaoVaga;
	}
	public String getProjeto() {
		return projeto;
	}
	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}
	public Integer getQtdVaga() {
		return qtdVaga;
	}
	public void setQtdVaga(Integer qtdVaga) {
		this.qtdVaga = qtdVaga;
	}
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	
}
