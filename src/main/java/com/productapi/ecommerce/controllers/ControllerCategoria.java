package com.productapi.ecommerce.controllers;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.productapi.ecommerce.event.RecursoCriadoEvent;
import com.productapi.ecommerce.model.processo_venda.Categoria;
import com.productapi.ecommerce.services.ServiceCategoria;

@RestController
@RequestMapping("categorias")
public class ControllerCategoria implements CADController<Categoria> {

	@Autowired
	private ServiceCategoria categoriaService;

	@Autowired
	private ApplicationEventPublisher publisher;

	@PostMapping
	@Override
	public ResponseEntity<Categoria> insere(@Valid Categoria Categoria, HttpServletResponse httpServletResponse) {
		Categoria produtoPersistido = categoriaService.persiste(Categoria);
		publisher.publishEvent(
				new RecursoCriadoEvent(produtoPersistido, httpServletResponse, produtoPersistido.getId()));
		return ResponseEntity.status(HttpStatus.CREATED).body(produtoPersistido);
	}

	@GetMapping
	@Override
	public List<Categoria> listar() {
		return categoriaService.listar();
	}

	@GetMapping("/{id}")
	@Override
	public ResponseEntity<Optional<Categoria>> consulta(Long id) {
		Optional<Categoria> Categoria = categoriaService.busca(id);
		return Categoria.isPresent() ? ResponseEntity.ok(Categoria) : ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@Override
	public void remove(Long id) {
		categoriaService.deleta(id);
	}

}
