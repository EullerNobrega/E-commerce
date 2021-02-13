package com.productapi.ecommerce.model.pagamento;

import javax.persistence.Entity;

import com.productapi.ecommerce.model.processo_venda.StatusPagamento;

/**
 * 
 */
@Entity
public class Boleto extends Pagamento implements RealizarPagamento {

	/**
	 * Default constructor
	 */
	public Boleto() {
	}

	@Override
	public StatusPagamento realizaPagamento(DadosPagamento dadosPagamento) {
		return StatusPagamento.Aguardando;
	}

}