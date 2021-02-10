package com.productapi.ecommerce.controllers;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface CADController<T> {

	public ResponseEntity<T> insere(@Valid @RequestBody T t, HttpServletResponse httpServletResponse);

	public List<T> listar();

	public ResponseEntity<Optional<T>> consulta(@PathVariable Long id);

	public void remove(@RequestParam Long id);

}
