package com.ricardocasanova.petshop.dto;

import com.ricardocasanova.petshop.entity.Perfil;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

	private Integer CPF;
	
    @NotNull
    @NotEmpty
	private String nome;

    @NotNull
    @NotEmpty
    private Perfil perfil;

    @NotNull
    @NotEmpty
	private String senha;
}
