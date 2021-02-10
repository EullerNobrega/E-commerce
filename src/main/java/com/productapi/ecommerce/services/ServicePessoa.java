package com.productapi.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapi.ecommerce.dao.DaoPessoa;
import com.productapi.ecommerce.model.pessoa.Pessoa;

@Service
public class ServicePessoa implements CadService<Pessoa>{
	@Autowired
	DaoPessoa daoPessoas;

	@Override
	public Pessoa persiste(Pessoa p) {
		return daoPessoas.save(p);
	}

	@Override
	public List<Pessoa> listar() {
		return daoPessoas.findAll();
	}

	@Override
	public Optional<Pessoa> busca(Long id) {
		return daoPessoas.findById(id);
	}

	@Override
	public void deleta(Long id) {
		daoPessoas.deleteById(id);
	}

}
