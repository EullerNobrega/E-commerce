package com.productapi.ecommerce.model.processo_venda;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.productapi.ecommerce.model.AbstractEntity;

/**
 * 
 */
@Entity
public class Produto extends AbstractEntity {

	/**
	 * Default constructor
	 */
	public Produto() {
	}

	/**
	 * 
	 */
	@NotNull
	private String descricao;

	/**
	 * 
	 */
	private float preco;

	/**
	 * 
	 */
	private int qtdEstoque;

	/**
	 * 
	 */
	@OneToOne
	private Categoria categoria;

	/**
	 * 
	 */

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}