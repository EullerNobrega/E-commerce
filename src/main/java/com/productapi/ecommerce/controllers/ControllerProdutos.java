package com.productapi.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.productapi.ecommerce.model.processo_venda.Produto;
import com.productapi.ecommerce.services.ServiceProduto;

@RestController("produtos")
public class ControllerProdutos extends CADControllerGenerico<Produto>{
	@Autowired
	private ServiceProduto produto;
	
	
}
