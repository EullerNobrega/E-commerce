
package com.productapi.ecommerce.security.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.productapi.ecommerce.dao.DaoUsuario;
import com.productapi.ecommerce.model.pessoa.Usuario;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	DaoUsuario daoUsuario;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = daoUsuario.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));
		return UserDetailsImpl.build(usuario);
	}
}
