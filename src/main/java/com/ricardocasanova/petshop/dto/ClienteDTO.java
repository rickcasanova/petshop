package com.ricardocasanova.petshop.dto;

import java.util.Date;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {

	private Long id;
	
	@NotNull
	@NotEmpty
	@Size(max = 255)
	private String nome;

	@NotNull
	@NotEmpty
	private String cpf;

	@NotNull
	@NotEmpty
	private Date dtCadastro;
}
