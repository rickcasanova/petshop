package com.ricardocasanova.petshop.dto;

import java.util.Date;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AtendimentoDTO {
	
	private Long id;

	@NotNull
	@NotEmpty
	private String descricaoAtendimento;

	@NotNull
	@NotEmpty
	private float valor;
	
	@NotNull
	@NotEmpty
	private Date dtAtendimento;
}
