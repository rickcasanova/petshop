package com.ricardocasanova.petshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardocasanova.petshop.mapper.EnderecoMapper;
import com.ricardocasanova.petshop.repository.EnderecoRepository;

@Service
public class EnderecoService {

	private final static EnderecoMapper enderecoMapper = EnderecoMapper.INSTANCE;
	
	private EnderecoRepository enderecoRepository;

	@Autowired
	public EnderecoService(EnderecoRepository enderecoRepository) {
		super();
		this.enderecoRepository = enderecoRepository;
	}
}
