package com.productapi.ecommerce.model.pessoa;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.br.CNPJ;

/**
 * 
 */
@Entity
public class PessoaJuridica extends Pessoa {

	/**
	 * Default constructor
	 */
	public PessoaJuridica() {
	}

	/**
	 * 
	 */
	@CNPJ
	private String cnpj;

	/**
	 * 
	 */
	private String nome;

	/**
	 * 
	 */
	private String razaoSocial;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

}