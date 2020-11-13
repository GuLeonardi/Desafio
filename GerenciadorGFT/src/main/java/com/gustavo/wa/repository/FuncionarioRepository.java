package com.gustavo.wa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.wa.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
	public Funcionario findByMatricula(String matricula);
}
