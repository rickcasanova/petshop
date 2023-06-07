package com.ricardocasanova.petshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardocasanova.petshop.mapper.PetsMapper;
import com.ricardocasanova.petshop.repository.PetsRepository;

@Service
public class PetsService {

	private final static PetsMapper petsMapper = PetsMapper.INSTANCE;
	
	private PetsRepository petsRepository;

	@Autowired
	public PetsService(PetsRepository petsRepository) {
		super();
		this.petsRepository = petsRepository;
	}
}
