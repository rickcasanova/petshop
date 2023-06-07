package com.ricardocasanova.petshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardocasanova.petshop.mapper.ClienteMapper;
import com.ricardocasanova.petshop.repository.ClienteRepository;

@Service
public class ClienteService {

	private final static ClienteMapper clienteMapper = ClienteMapper.INSTANCE;
	
	private ClienteRepository clienteRepository;

	@Autowired
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
}
