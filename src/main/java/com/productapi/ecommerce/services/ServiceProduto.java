package com.productapi.ecommerce.services;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.productapi.ecommerce.dao.DaoProduto;
import com.productapi.ecommerce.model.processo_venda.Produto;

public class ServiceProduto implements CadServiceGenerico<Produto>{
	@Autowired
	DaoProduto daoProdutos;

	@Override
	public ResponseEntity<Produto> persiste(Produto t, HttpServletResponse httpServletResponse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Optional<Produto>> busca(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleta(Long id) {
		// TODO Auto-generated method stub
		
	}

}
