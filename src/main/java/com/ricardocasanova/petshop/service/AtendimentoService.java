package com.ricardocasanova.petshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardocasanova.petshop.mapper.AtendimentoMapper;
import com.ricardocasanova.petshop.repository.AtendimentoRepository;

@Service
public class AtendimentoService {

	private final static AtendimentoMapper atendimentoMapper = AtendimentoMapper.INSTANCE;
	
	private AtendimentoRepository atendimentoRepository;

	@Autowired
	public AtendimentoService(AtendimentoRepository atendimentoRepository) {
		super();
		this.atendimentoRepository = atendimentoRepository;
	}	
	
}
