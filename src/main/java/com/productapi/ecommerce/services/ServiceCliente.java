package com.productapi.ecommerce.services;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.productapi.ecommerce.dao.DaoPessoa;
import com.productapi.ecommerce.model.pessoa.Cliente;

public class ServiceCliente implements CadServiceGenerico<Cliente>{
	@Autowired
	DaoPessoa daoPessoa;

	@Override
	public ResponseEntity<Cliente> persiste(Cliente t, HttpServletResponse httpServletResponse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Optional<Cliente>> busca(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleta(Long id) {
		// TODO Auto-generated method stub
		
	}

}
