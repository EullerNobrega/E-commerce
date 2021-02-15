package com.productapi.ecommerce.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.Optional;

import com.productapi.ecommerce.model.pessoa.Usuario;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ServiceUsuarioTest {
    @InjectMocks
    ServiceUsuario serviceUsuario;

    @Test
    void testPersisteUsuario() {
        Usuario u = mock(Usuario.class);
        serviceUsuario.persiste(u);

        Optional<Usuario> uComparado = serviceUsuario.busca(u.getId());

        assertEquals(u, uComparado.get());
    }
}
