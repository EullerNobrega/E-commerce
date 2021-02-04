package com.productapi.ecommerce.model;

import javax.persistence.Entity;

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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}