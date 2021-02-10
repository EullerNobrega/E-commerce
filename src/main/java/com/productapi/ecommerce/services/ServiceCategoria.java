package com.productapi.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapi.ecommerce.dao.DaoCategoria;
import com.productapi.ecommerce.model.processo_venda.Categoria;


@Service
public class ServiceCategoria implements CadService<Categoria>{
	@Autowired
	DaoCategoria daoCategoria;

	@Override
	public Categoria persiste(Categoria c) {
		return daoCategoria.save(c);
	}

	@Override
	public List<Categoria> listar() {
		return daoCategoria.findAll();
	}

	@Override
	public Optional<Categoria> busca(Long id) {
		return daoCategoria.findById(id);
	}

	@Override
	public void deleta(Long id) {
		daoCategoria.deleteById(id);;
		
	}

}
