package com.productapi.ecommerce.services;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface CadService<T> {
	
	public T persiste(@Valid @RequestBody T t);
	
	public List<T> listar();
	
	public Optional<T> busca(Long id);
	
	public void deleta (Long id);

}
