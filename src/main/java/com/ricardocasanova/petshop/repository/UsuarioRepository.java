package com.ricardocasanova.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardocasanova.petshop.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	 
}
