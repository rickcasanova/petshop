package com.ricardocasanova.petshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardocasanova.petshop.mapper.RacaMapper;
import com.ricardocasanova.petshop.repository.RacaRepository;

@Service
public class RacaService {

	private final static RacaMapper racaMapper = RacaMapper.INSTANCE;
	
	private RacaRepository racaRepository;

	@Autowired
	public RacaService(RacaRepository racaRepository) {
		super();
		this.racaRepository = racaRepository;
	}

}
