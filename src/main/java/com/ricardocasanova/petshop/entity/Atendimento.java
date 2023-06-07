package com.ricardocasanova.petshop.entity;

import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "atendimento")
public class Atendimento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column
	private Long id;

	@ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name="idPet", nullable=false)
	private Pets idPet;

	@Basic
	@Column
	private String descricaoAtendimento;

	@Basic
	@Column
	private float valor;
	
	@Basic
	@Column
	private Date dtAtendimento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pets getIdPet() {
		return idPet;
	}

	public void setIdPet(Pets idPet) {
		this.idPet = idPet;
	}

	public String getDescricaoAtendimento() {
		return descricaoAtendimento;
	}

	public void setDescricaoAtendimento(String descricaoAtendimento) {
		this.descricaoAtendimento = descricaoAtendimento;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Date getDtAtendimento() {
		return dtAtendimento;
	}

	public void setDtAtendimento(Date dtAtendimento) {
		this.dtAtendimento = dtAtendimento;
	}
}
