package com.ricardocasanova.petshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardocasanova.petshop.mapper.UsuarioMapper;
import com.ricardocasanova.petshop.repository.UsuarioRepository;

@Service
public class UsuarioService {

	private final static UsuarioMapper usuarioMapper = UsuarioMapper.INSTANCE;
	
	private UsuarioRepository usuarioRepository;

	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}
}
