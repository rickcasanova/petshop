package com.ricardocasanova.petshop.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ricardocasanova.petshop.dto.AtendimentoDTO;
import com.ricardocasanova.petshop.entity.Atendimento;

@Mapper
public interface AtendimentoMapper {
	
	AtendimentoMapper INSTANCE = Mappers.getMapper(AtendimentoMapper.class);
	
	Atendimento toModel(AtendimentoDTO atendimentoDTO);
	
	AtendimentoDTO toDto(Atendimento atendimento);
}
