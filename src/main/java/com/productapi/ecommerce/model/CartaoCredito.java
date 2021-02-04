package com.productapi.ecommerce.model;

/**
 * 
 */

public class CartaoCredito extends Pagamento implements RealizarPagamento {

	/**
	 * Default constructor
	 */
	public CartaoCredito() {
	}

	@Override
	public StatusPagamento realizaPagamento(Pagamento pagamento) {
		// TODO Auto-generated method stub
		return StatusPagamento.Aguardando;
	}

}