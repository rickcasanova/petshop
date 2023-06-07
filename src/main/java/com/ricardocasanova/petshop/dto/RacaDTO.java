package com.ricardocasanova.petshop.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RacaDTO {

	private Long id;
	
	@NotNull
	@NotEmpty
	private String descricao;
}
