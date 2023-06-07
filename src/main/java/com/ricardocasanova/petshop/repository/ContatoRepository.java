package com.ricardocasanova.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardocasanova.petshop.entity.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
	 
}
