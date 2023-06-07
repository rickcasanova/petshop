package com.ricardocasanova.petshop.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "pets")
public class Pets {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column
	private Long id;
	
	@ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name="idCliente", nullable=false)
	private Cliente idCliente;
	
	@ManyToOne
    @JoinColumn(name="idRaca", nullable=false)
	private Raca idRaca;
	
	@Basic
	@Column
	private Date dtNascimento;

	@Basic
	@Column
	private String nome;
	
	@OneToMany(mappedBy = "idPet", fetch = FetchType.LAZY)
	private List<Atendimento> atendimentos;

	public List<Atendimento> getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(List<Atendimento> atendimentos) {
		this.atendimentos = atendimentos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

	public Raca getIdRaca() {
		return idRaca;
	}

	public void setIdRaca(Raca idRaca) {
		this.idRaca = idRaca;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
