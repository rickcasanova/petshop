package com.ricardocasanova.petshop.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ricardocasanova.petshop.dto.ContatoDTO;
import com.ricardocasanova.petshop.entity.Contato;

@Mapper
public interface ContatoMapper {
	
	ContatoMapper INSTANCE = Mappers.getMapper(ContatoMapper.class);
	
	Contato toModel(ContatoDTO contatoDTO);
	
	ContatoDTO toDto(Contato contato);
}
