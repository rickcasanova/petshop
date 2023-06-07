package com.ricardocasanova.petshop.dto;

import com.ricardocasanova.petshop.entity.Tipo;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContatoDTO {

	private Long id;
	
	@NotNull
	@NotEmpty
	private String tag;

	@NotNull
	@NotEmpty
	private Tipo tipo;

	@NotNull
	@NotEmpty
	private String valor;
}
