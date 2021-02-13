package com.productapi.ecommerce.dao;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.productapi.ecommerce.model.pessoa.EFuncao;
import com.productapi.ecommerce.model.pessoa.Funcao;

@Repository
public interface DaoFuncao extends DaoGenerico<Funcao>{
	Optional<Funcao> findByName(EFuncao name);
}
