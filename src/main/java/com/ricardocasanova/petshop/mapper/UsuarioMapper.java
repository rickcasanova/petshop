package com.ricardocasanova.petshop.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ricardocasanova.petshop.dto.UsuarioDTO;
import com.ricardocasanova.petshop.entity.Usuario;

@Mapper
public interface UsuarioMapper {
	
	UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);
	
	Usuario toModel(UsuarioDTO usuarioDTO);
	
	UsuarioDTO toDto(Usuario usuario);
}
