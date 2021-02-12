package com.productapi.ecommerce.model.pessoa;

import java.time.*;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.br.CPF;

/**
 * 
 */
@Entity
public class PessoaFisica extends Pessoa {

	/**
	 * Default constructor
	 */
	public PessoaFisica() {
	}

	/**
	 * 
	 */
	@CPF
	private String cpf;

	/**
	 * 
	 */
	private String nome;

	/**
	 * 
	 */
	private LocalDate dataNascimento;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}