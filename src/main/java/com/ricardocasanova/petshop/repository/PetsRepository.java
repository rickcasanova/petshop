package com.ricardocasanova.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardocasanova.petshop.entity.Pets;

public interface PetsRepository extends JpaRepository<Pets, Long> {
	 
}
