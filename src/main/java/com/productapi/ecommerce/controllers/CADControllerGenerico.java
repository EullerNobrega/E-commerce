package com.productapi.ecommerce.controllers;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.productapi.ecommerce.services.CadServiceGenerico;

public abstract class CADControllerGenerico<T> {

	@Autowired
	private CadServiceGenerico<T> cadServiceGenerico;

	@PostMapping
	public ResponseEntity<T> insere(@Valid @RequestBody T t, HttpServletResponse httpServletResponse) {
		return cadServiceGenerico.persiste(t, httpServletResponse);
	}

	@GetMapping
	public List<T> listar() {
		return cadServiceGenerico.listar();
	}

	@GetMapping("/id")
	public ResponseEntity<Optional<T>> consulta(@PathVariable Long id) {
		return cadServiceGenerico.busca(id);
	}

	@DeleteMapping("/id")
	public void remove(@RequestParam Long id) {
		cadServiceGenerico.deleta(id);
	}

}
