package com.productapi.ecommerce.dao;

import java.util.Optional;

import com.productapi.ecommerce.model.pessoa.EFuncao;
import com.productapi.ecommerce.model.pessoa.Funcao;

public interface DaoFuncao extends DaoGenerico<Funcao>{
	Optional<Funcao> findByName(EFuncao name);
}
