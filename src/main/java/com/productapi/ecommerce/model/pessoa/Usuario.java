package com.productapi.ecommerce.model.pessoa;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.productapi.ecommerce.model.AbstractEntity;

/**
 * 
 */
@Entity
public class Usuario extends AbstractEntity {

	/**
	 * Default constructor
	 */
	public Usuario() {
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

	/**
	 * 
	 */
	@OneToOne
	private Pessoa dadosPessoa;


	/**
	 * @param username
	 * @param senha
	 * @param email
	 */
	public Usuario(String username, String senha, String email) {
		super();
		this.username = username;
		this.senha = senha;
		this.email = email;
	}
	
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable( name = "usuario_funcoes",
                joinColumns = @JoinColumn(name="usuario_id"),
                inverseJoinColumns = @JoinColumn(name= "funcao_id"))
    private Set<Funcao> funcoes = new HashSet<>();

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

	public Pessoa getDadosPessoa() {
		return dadosPessoa;
	}

	public void setDadosPessoa(Pessoa dadosPessoa) {
		this.dadosPessoa = dadosPessoa;
	}

	public Usuario orElseThrow(Object object) {
		return null;
	}

	public Set<Funcao> getFuncoes() {
		return funcoes;
	}

	public void setFuncoes(Set<Funcao> funcoes) {
		this.funcoes = funcoes;
	}

}