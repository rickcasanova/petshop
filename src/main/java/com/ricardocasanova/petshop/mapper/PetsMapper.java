package com.ricardocasanova.petshop.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ricardocasanova.petshop.dto.PetsDTO;
import com.ricardocasanova.petshop.entity.Pets;

@Mapper
public interface PetsMapper {
	
	PetsMapper INSTANCE = Mappers.getMapper(PetsMapper.class);
	
	Pets toModel(PetsDTO petsDTO);
	
	PetsDTO toDto(Pets pets);
}
