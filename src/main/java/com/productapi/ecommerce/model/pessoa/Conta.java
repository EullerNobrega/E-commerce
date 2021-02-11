package com.productapi.ecommerce.model.pessoa;

import javax.persistence.Entity;

import com.productapi.ecommerce.model.AbstractEntity;

/**
 * 
 */
@Entity
public class Conta extends AbstractEntity {

	/**
	 * Default constructor
	 */
	public Conta() {
	}

	/**
	 * @param username
	 * @param senha
	 */
	public Conta(String username, String senha, String email) {
		super();
		this.username = username;
		this.senha = senha;
		this.email = email;
	}

	/**
	 * 
	 */
	private String username;

	/**
	 * 
	 */
	private String senha;

	/**
	 * 
	 */
	private String email;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}