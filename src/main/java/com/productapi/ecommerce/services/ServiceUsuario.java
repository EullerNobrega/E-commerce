package com.productapi.ecommerce.services;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.productapi.ecommerce.dao.DaoUsuario;
import com.productapi.ecommerce.dao.DaoPessoa;
import com.productapi.ecommerce.model.pessoa.Usuario;

@Service
public class ServiceUsuario implements CadService<Usuario> {
	@Autowired
	DaoUsuario daoUsuario;

	@Override
	public Usuario persiste(Usuario c) {
		return daoUsuario.save(c);
	}

	@Override
	public List<Usuario> listar() {
		return daoUsuario.findAll();
	}

	@Override
	public Optional<Usuario> busca(Long id) {
		return daoUsuario.findById(id);
	}

	@Override
	public void deleta(Long id) {
		daoUsuario.deleteById(id);
	}

}
