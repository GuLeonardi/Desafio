package com.gustavo.wa.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private Cargo cargo;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date inicioWa;
	
	private Integer matricula;
	
	private String nome;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date fimWa;
	
	@ManyToOne
	@JoinColumn(name = "Gft_id")
	private Gft gft;
	
	@ManyToOne
	@JoinColumn(name = "vaga_id")
	private Vaga vaga;
	
	@ManyToMany
	@JoinTable(name = "funcionario_tecnologia", joinColumns = @JoinColumn(name = "id"),
	inverseJoinColumns = @JoinColumn(name = "tecnologia_id"))
	private List<Tecnologia> tecnologia;

	


	public List<Tecnologia> getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(List<Tecnologia> tecnologia) {
		this.tecnologia = tecnologia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Date getInicioWa() {
		return inicioWa;
	}

	public void setInicioWa(Date inicioWa) {
		this.inicioWa = inicioWa;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getFimWa() {
		return fimWa;
	}

	public void setFimWa(Date fimWa) {
		this.fimWa = fimWa;
	}

	public Gft getGft() {
		return gft;
	}

	public void setGft(Gft gft) {
		this.gft = gft;
	}

	public Vaga getVaga() {
		return vaga;
	}

	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
	}

	

	

	
	
}

