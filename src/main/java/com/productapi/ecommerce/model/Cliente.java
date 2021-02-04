package com.productapi.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * 
 */
@Entity
public class Cliente extends AbstractEntity {

	/**
	 * Default constructor
	 */
	public Cliente() {
	}

	/**
	 * 
	 */
	@OneToOne
	private Conta conta;

	/**
	 * 
	 */
	@OneToOne
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