package com.productapi.ecommerce.model;

import java.util.List;

/**
 * 
 */
public class Compra {

	/**
	 * Default constructor
	 */
	public Compra() {
	}

	/**
	 * 
	 */
	private StatusPagamento situacao;

	/**
	 * 
	 */
	private Cliente clientePagador;

	/**
	 * 
	 */
	private List<Item> itens;

	/**
	 * 
	 */
	private double valorCompra;
	

	public StatusPagamento getSituacao() {
		return situacao;
	}

	public void setSituacao(StatusPagamento situacao) {
		this.situacao = situacao;
	}

	public Cliente getClientePagador() {
		return clientePagador;
	}

	public void setClientePagador(Cliente clientePagador) {
		this.clientePagador = clientePagador;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
}