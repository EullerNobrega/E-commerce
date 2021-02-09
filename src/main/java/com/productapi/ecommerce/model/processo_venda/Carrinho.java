package com.productapi.ecommerce.model.processo_venda;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.productapi.ecommerce.model.AbstractEntity;
import com.productapi.ecommerce.model.pessoa.Cliente;

/**
 * 
 */
@Entity
public class Carrinho extends AbstractEntity {

	/**
	 * Default constructor
	 */
	public Carrinho() {
	}

	/**
	 * 
	 */
	private float total;

	/**
	 * 
	 */
	@OneToMany
	private List<Item> itens;
	
	/**
	 * 
	 */
	@OneToOne
	private Cliente cliente;

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}