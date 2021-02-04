package com.productapi.ecommerce.model;

import javax.persistence.Entity;

/**
 * 
 */
@Entity
public class Pagamento extends AbstractEntity {

	/**
	 * Default constructor
	 */
	public Pagamento() {
	}

	/**
	 * 
	 */
	private int codPagamento;

	public int getCodPagamento() {
		return codPagamento;
	}

	public void setCodPagamento(int codPagamento) {
		this.codPagamento = codPagamento;
	}

}