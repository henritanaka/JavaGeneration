package com.minhaEscola.minhaEscola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaEscola.minhaEscola.model.Aluno;

public interface AlunoRepository  extends JpaRepository <Aluno, Long>{
	public List<Aluno> findAllByNomeContainingIgnoreCase(String nome);
}
