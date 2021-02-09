package com.productapi.ecommerce.model.pessoa;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

import com.productapi.ecommerce.model.AbstractEntity;

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