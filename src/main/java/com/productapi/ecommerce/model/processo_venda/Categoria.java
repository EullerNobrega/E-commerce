package com.productapi.ecommerce.model.processo_venda;

import javax.persistence.Entity;

import com.productapi.ecommerce.model.AbstractEntity;

/**
 * 
 */
@Entity
public class Categoria extends AbstractEntity {

	/**
	 * Default constructor
	 */
	public Categoria() {
	}

	/**
	 * 
	 */
	private String tipo;
	
	/**
	 * 
	 */

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}