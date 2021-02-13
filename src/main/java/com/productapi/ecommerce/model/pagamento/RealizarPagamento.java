package com.productapi.ecommerce.model.pagamento;

import com.productapi.ecommerce.model.processo_venda.StatusPagamento;

public interface RealizarPagamento {
	
	public StatusPagamento realizaPagamento(DadosPagamento dadosPagamento);

}
