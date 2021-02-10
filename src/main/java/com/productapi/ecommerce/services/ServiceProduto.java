package com.productapi.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapi.ecommerce.dao.DaoProduto;
import com.productapi.ecommerce.model.processo_venda.Produto;

@Service
public class ServiceProduto implements CadService<Produto>{
	@Autowired
	DaoProduto daoProdutos;

	@Override
	public Produto persiste(Produto p) {
		return daoProdutos.save(p);
	}

	@Override
	public List<Produto> listar() {
		return daoProdutos.findAll();
	}

	@Override
	public Optional<Produto> busca(Long id) {
		return daoProdutos.findById(id);
	}

	@Override
	public void deleta(Long id) {
		daoProdutos.deleteById(id);
	}

}
