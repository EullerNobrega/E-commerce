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
import com.productapi.ecommerce.model.pessoa.Usuario;
import com.productapi.ecommerce.services.ServiceUsuario;

@RestController
@RequestMapping("usuarios")
public class ControllerUsuario implements CADController<Usuario> {

	@Autowired
	private ServiceUsuario usuarioService;

	@Autowired
	private ApplicationEventPublisher publisher;

	@PostMapping
	@Override
	public ResponseEntity<Usuario> insere(@Valid Usuario usuario, HttpServletResponse httpServletResponse) {
		Usuario usuarioPersistido = usuarioService.persiste(usuario);
		publisher.publishEvent(new RecursoCriadoEvent(this, httpServletResponse, usuarioPersistido.getId()));
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioPersistido);
	}

	@GetMapping
	@Override
	public List<Usuario> listar() {
		return usuarioService.listar();
	}

	@GetMapping("/{id}")
	@Override
	public ResponseEntity<Optional<Usuario>> consulta(Long id) {
		Optional<Usuario> usuario = usuarioService.busca(id);
		return usuario.isPresent() ? ResponseEntity.ok(usuario) : ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@Override
	public void remove(Long id) {
		usuarioService.deleta(id);

	}

}
