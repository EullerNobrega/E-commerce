package com.productapi.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * 
 */
@Entity
public class Item extends AbstractEntity {

	/**
	 * Default constructor
	 */
	public Item() {
	}

	/**
	 * 
	 */
	private int quantidade;

	/**
	 * 
	 */
	@OneToOne
	private Produto produto;

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}