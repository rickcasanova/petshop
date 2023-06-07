package com.ricardocasanova.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardocasanova.petshop.entity.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
	 
}
