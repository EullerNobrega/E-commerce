package com.productapi.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.productapi.ecommerce.dao.DaoPessoa;
import com.productapi.ecommerce.dao.DaoProduto;
import com.productapi.ecommerce.model.pessoa.Cliente;
import com.productapi.ecommerce.model.processo_venda.Produto;
import com.productapi.ecommerce.services.ServiceCliente;

@RestController("clientes")
public class ControllerCliente extends CADControllerGenerico<Cliente>{

	@Autowired
	private ServiceCliente cliente;
	
	
}
