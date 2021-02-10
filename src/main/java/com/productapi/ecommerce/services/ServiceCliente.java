package com.productapi.ecommerce.services;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.productapi.ecommerce.dao.DaoCliente;
import com.productapi.ecommerce.dao.DaoPessoa;
import com.productapi.ecommerce.model.pessoa.Cliente;

@Service
public class ServiceCliente implements CadService<Cliente>{
	@Autowired
	DaoCliente daoCliente;

	@Override
	public Cliente persiste(Cliente c) {
		return daoCliente.save(c);
	}

	@Override
	public List<Cliente> listar() {
		return daoCliente.findAll();
	}

	@Override
	public Optional<Cliente> busca(Long id) {
		return daoCliente.findById(id);
	}

	@Override
	public void deleta(Long id) {
		daoCliente.deleteById(id);;
		
	}

}
