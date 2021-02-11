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
	@OneToOne
	private Conta conta;

	/**
	 * 
	 */
	@OneToOne
	private Pessoa dadosPessoa;

	/**
	 * 
	 */
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable( name = "usuario_funcoes",
                joinColumns = @JoinColumn(name="usuario_id"),
                inverseJoinColumns = @JoinColumn(name= "funcao_id"))
    private Set<Funcao> funcoes = new HashSet<>();

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
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