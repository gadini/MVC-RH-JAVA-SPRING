package com.github.acnaweb.mvc_rh.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.github.acnaweb.mvc_rh.model.Funcionario;

public class FormFuncionario {
	private Long id;
	private String nome;
	private LocalDate dataEntrada;
	private LocalDate dataSaida;
	private BigDecimal salario;
	private Long idCargo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public LocalDate getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Long getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(Long idCargo) {
		this.idCargo = idCargo;
	}

	public FormFuncionario toForm(Funcionario funcionario) {

		return this;
	}
	
	public Funcionario toModel() {
		Funcionario funcionario = new Funcionario();
		
		return funcionario;		
	}

}
