package com.productapi.ecommerce.model;


import java.util.*;

/**
 * 
 */
public class Carrinho {

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
    private List<Item> itens;

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



}