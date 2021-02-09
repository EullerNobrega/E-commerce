package com.productapi.ecommerce.services;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface CadServiceGenerico<T> {
	
	public ResponseEntity<T> persiste(@Valid @RequestBody T t, HttpServletResponse httpServletResponse);
	
	public List<T> listar();
	
	public ResponseEntity<Optional<T>> busca(Long id);
	
	public void deleta (Long id);

}
