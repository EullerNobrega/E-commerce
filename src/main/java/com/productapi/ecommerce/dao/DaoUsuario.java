package com.productapi.ecommerce.dao;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.productapi.ecommerce.model.pessoa.Usuario;

@Repository
public interface DaoUsuario extends DaoGenerico<Usuario> {
	Optional<Usuario> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);


}
