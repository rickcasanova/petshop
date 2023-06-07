package com.ricardocasanova.petshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardocasanova.petshop.mapper.ContatoMapper;
import com.ricardocasanova.petshop.repository.ContatoRepository;

@Service
public class ContatoService {

	private final static ContatoMapper contatoMapper = ContatoMapper.INSTANCE;
	
	private ContatoRepository contatoRepository;

	@Autowired
	public ContatoService(ContatoRepository contatoRepository) {
		super();
		this.contatoRepository = contatoRepository;
	}
	
	
}
