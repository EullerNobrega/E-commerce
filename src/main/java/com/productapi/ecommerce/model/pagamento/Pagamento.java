package com.productapi.ecommerce.model.pagamento;

import javax.persistence.Entity;

import com.productapi.ecommerce.model.AbstractEntity;

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