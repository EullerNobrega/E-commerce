package com.productapi.ecommerce.model;

/**
 * 
 */
public enum StatusPagamento {
    Pago("1", "Pagamento Efetuado"),
    Aguardando("2", "Aguardando Pagamento"),
    Recusado("3", "Pagamento recusado");
    
    /**
     * 
     */
    private String descricao;
    
    /**
     * 
     */
    private String codigoStatus;
    

	/**
	 * @param descricao
	 */
	private StatusPagamento(String codigoStatus,String descricao) {
		this.codigoStatus = codigoStatus;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}


	public String getCodigoStatus() {
		return codigoStatus;
	}


	
	
}