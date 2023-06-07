package com.ricardocasanova.petshop.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ricardocasanova.petshop.dto.ClienteDTO;
import com.ricardocasanova.petshop.entity.Cliente;

@Mapper
public interface ClienteMapper {
	
	ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);
	
	Cliente toModel(ClienteDTO clienteDTO);
	
	ClienteDTO toDto(Cliente cliente);
}
