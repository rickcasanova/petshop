package com.ricardocasanova.petshop.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ricardocasanova.petshop.dto.EnderecoDTO;
import com.ricardocasanova.petshop.entity.Endereco;

@Mapper
public interface EnderecoMapper {
	
	EnderecoMapper INSTANCE = Mappers.getMapper(EnderecoMapper.class);
	
	Endereco toModel(EnderecoDTO enderecoDTO);
	
	EnderecoDTO toDto(Endereco endereco);
}
