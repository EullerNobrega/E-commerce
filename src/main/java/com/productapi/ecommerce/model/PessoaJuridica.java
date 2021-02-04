package com.productapi.ecommerce.model;

/**
 * 
 */
public class PessoaJuridica extends Pessoa {

	/**
	 * Default constructor
	 */
	public PessoaJuridica() {
	}

	/**
	 * 
	 */
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