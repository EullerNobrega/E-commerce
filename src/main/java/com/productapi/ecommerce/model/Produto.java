package com.productapi.ecommerce.model;

/**
 * 
 */
public class Produto {

    /**
     * Default constructor
     */
    public Produto() {
    }

    /**
     * 
     */
    private String descricao;

    /**
     * 
     */
    private float preco;

    /**
     * 
     */
    private String qtdEstoque;

    /**
     * 
     */
    private Categoria categoria;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(String qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public Categoria getCategorial() {
		return categoria;
	}

	public void setCategorial(Categoria categoria) {
		this.categoria = categoria;
	}
    
}