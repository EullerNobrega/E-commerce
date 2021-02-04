package com.productapi.ecommerce.model;

/**
 * 
 */
public class CartaoDebito extends Pagamento implements RealizarPagamento {

    /**
     * Default constructor
     */
    public CartaoDebito() {
    }

	@Override
	public StatusPagamento realizaPagamento(Pagamento pagamento) {
		// TODO Auto-generated method stub
		return StatusPagamento.Aguardando ;
	}

}