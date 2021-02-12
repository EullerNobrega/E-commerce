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
import com.productapi.ecommerce.model.pessoa.Pessoa;
import com.productapi.ecommerce.services.ServicePessoa;

@RestController
@RequestMapping("pessoas")
public class ControllerPessoa implements CADController<Pessoa> {

	@Autowired
	private ServicePessoa produtoService;

	@Autowired
	private ApplicationEventPublisher publisher;

	@PostMapping
	@Override
	public ResponseEntity<Pessoa> insere(@Valid Pessoa produto, HttpServletResponse httpServletResponse) {
		Pessoa produtoPersistido = produtoService.persiste(produto);
		publisher.publishEvent(
				new RecursoCriadoEvent(produtoPersistido, httpServletResponse, produtoPersistido.getId()));
		return ResponseEntity.status(HttpStatus.CREATED).body(produtoPersistido);
	}

	@GetMapping
	@Override
	public List<Pessoa> listar() {
		return produtoService.listar();
	}

	@GetMapping("/{id}")
	@Override
	public ResponseEntity<Optional<Pessoa>> consulta(Long id) {
		Optional<Pessoa> produto = produtoService.busca(id);
		return produto.isPresent() ? ResponseEntity.ok(produto) : ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@Override
	public void remove(Long id) {
		produtoService.deleta(id);
	}

}
