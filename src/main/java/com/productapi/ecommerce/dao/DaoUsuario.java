package com.productapi.ecommerce.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.productapi.ecommerce.model.pessoa.Usuario;

public interface DaoUsuario extends DaoGenerico<Usuario> {
	Optional<Usuario> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);


}
