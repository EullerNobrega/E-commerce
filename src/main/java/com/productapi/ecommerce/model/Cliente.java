package com.productapi.ecommerce.model;

/**
 * 
 */
public class Cliente {

	/**
	 * Default constructor
	 */
	public Cliente() {
	}

	/**
	 * 
	 */
	private Conta conta;

	/**
	 * 
	 */
	private Pessoa dadosPessoa;

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Pessoa getDadosPessoa() {
		return dadosPessoa;
	}

	public void setDadosPessoa(Pessoa dadosPessoa) {
		this.dadosPessoa = dadosPessoa;
	}

}