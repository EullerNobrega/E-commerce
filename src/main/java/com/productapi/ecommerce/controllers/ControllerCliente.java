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
import com.productapi.ecommerce.model.pessoa.Cliente;
import com.productapi.ecommerce.services.ServiceCliente;

@RestController
@RequestMapping("clientes")
public class ControllerCliente implements CADController<Cliente> {

	@Autowired
	private ServiceCliente clienteService;

	@Autowired
	private ApplicationEventPublisher publisher;

	@PostMapping
	@Override
	public ResponseEntity<Cliente> insere(@Valid Cliente cliente, HttpServletResponse httpServletResponse) {
		Cliente clientePersistido = clienteService.persiste(cliente);
		publisher.publishEvent(new RecursoCriadoEvent(this, httpServletResponse, clientePersistido.getId()));
		return ResponseEntity.status(HttpStatus.CREATED).body(clientePersistido);
	}

	@GetMapping
	@Override
	public List<Cliente> listar() {
		return clienteService.listar();
	}

	@GetMapping("/{id}")
	@Override
	public ResponseEntity<Optional<Cliente>> consulta(Long id) {
		Optional<Cliente> cliente = clienteService.busca(id);
		return cliente.isPresent() ? ResponseEntity.ok(cliente) : ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@Override
	public void remove(Long id) {
		clienteService.deleta(id);

	}

}
