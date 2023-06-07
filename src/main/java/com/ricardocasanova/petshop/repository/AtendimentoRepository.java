package com.ricardocasanova.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardocasanova.petshop.entity.Atendimento;

public interface AtendimentoRepository extends JpaRepository<Atendimento, Long> {
	 
}
