package com.productapi.ecommerce.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

/**
 * 
 */
@Entity
@DiscriminatorColumn(name="Pessoa")
public abstract class Pessoa extends AbstractEntity {

	/**
	 * Default constructor
	 */
	public Pessoa() {
	}

}