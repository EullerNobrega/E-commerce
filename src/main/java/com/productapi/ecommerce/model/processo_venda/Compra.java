package com.productapi.ecommerce.model.processo_venda;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.productapi.ecommerce.model.AbstractEntity;
import com.productapi.ecommerce.model.pessoa.Usuario;

/**
 * 
 */
@Entity
public class Compra extends AbstractEntity {

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
	@OneToOne
	private Usuario UsuarioPagador;

	/**
	 * 
	 */
	@OneToMany
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

	public Usuario getUsuarioPagador() {
		return UsuarioPagador;
	}

	public void setUsuarioPagador(Usuario UsuarioPagador) {
		this.UsuarioPagador = UsuarioPagador;
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