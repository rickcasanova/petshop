package com.ricardocasanova.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardocasanova.petshop.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	 
}
