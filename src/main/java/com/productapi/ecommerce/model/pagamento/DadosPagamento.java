package com.productapi.ecommerce.model.pagamento;

import com.productapi.ecommerce.model.pessoa.Pessoa;
import com.productapi.ecommerce.model.pessoa.Usuario;

public class DadosPagamento {
	
	/**
	 * Default constructor
	 */
	public DadosPagamento() {
	}
	
	/**
	 * 
	 */
	private Usuario usuario;
	
	/**
	 * 
	 */
	private float valortransacao;
	
	/**
	 * 
	 */
	private Pessoa pessoa;
	
	/**
	 * 
	 */
	private String descricaoMovimentacao;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public float getValortransacao() {
		return valortransacao;
	}

	public void setValortransacao(float valortransacao) {
		this.valortransacao = valortransacao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getDescricaoMovimentacao() {
		return descricaoMovimentacao;
	}

	public void setDescricaoMovimentacao(String descricaoMovimentacao) {
		this.descricaoMovimentacao = descricaoMovimentacao;
	}
	
	
}
