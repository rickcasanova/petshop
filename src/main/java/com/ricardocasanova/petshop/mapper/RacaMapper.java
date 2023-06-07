package com.ricardocasanova.petshop.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ricardocasanova.petshop.dto.RacaDTO;
import com.ricardocasanova.petshop.entity.Raca;

@Mapper
public interface RacaMapper {
	
	RacaMapper INSTANCE = Mappers.getMapper(RacaMapper.class);
	
	Raca toModel(RacaDTO racaDTO);
	
	RacaDTO toDto(Raca raca);
}
