package com.productapi.ecommerce.model.pagamento;

import com.productapi.ecommerce.model.processo_venda.StatusPagamento;

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
		return StatusPagamento.Aguardando;
	}

}