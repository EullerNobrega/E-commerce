package com.productapi.ecommerce.model;

/**
 * 
 */
public class Boleto extends Pagamento implements RealizarPagamento {

    /**
     * Default constructor
     */
    public Boleto() {
    }

	@Override
	public StatusPagamento realizaPagamento(Pagamento pagamento) {
		// TODO Auto-generated method stub
		return StatusPagamento.Aguardando ;
	}

}