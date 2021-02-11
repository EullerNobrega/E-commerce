package com.productapi.ecommerce.security.controllers;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productapi.ecommerce.dao.DaoFuncao;
import com.productapi.ecommerce.dao.DaoUsuario;
import com.productapi.ecommerce.model.pessoa.Conta;
import com.productapi.ecommerce.model.pessoa.EFuncao;
import com.productapi.ecommerce.model.pessoa.Funcao;
import com.productapi.ecommerce.model.pessoa.Usuario;
import com.productapi.ecommerce.security.jwt.JwtUtils;
import com.productapi.ecommerce.security.payload.request.LoginRequest;
import com.productapi.ecommerce.security.payload.request.SignupRequest;
import com.productapi.ecommerce.security.payload.response.JwtResponse;
import com.productapi.ecommerce.security.payload.response.MessageResponse;
import com.productapi.ecommerce.security.services.UserDetailsImpl;

@CrossOrigin(origins = "*",maxAge=3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    DaoUsuario daoUsuario;

    @Autowired
    DaoFuncao daoFuncao;

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    JwtUtils jwtUtils;

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest){
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword())
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtils.generateJwtToken(authentication);

        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        List<String> funcoes = userDetails.getAuthorities().stream()
                .map(item -> item.getAuthority())
                .collect(Collectors.toList());
        return ResponseEntity.ok(new JwtResponse(jwt,userDetails.getId(),userDetails.getUsername(),
                                                    userDetails.getEmail(),funcoes));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest){
        if( daoUsuario.existsByUsername(signUpRequest.getUsername())){
            return ResponseEntity.badRequest().body(new MessageResponse("Erro: Nome de usuário já cadastrado!"));
        }
        if(daoUsuario.existsByEmail(signUpRequest.getEmail())){
            return ResponseEntity.badRequest().body(new MessageResponse("Erro: Email já cadastrado"));
        }

        Usuario user = new Usuario();
        user.setConta(new Conta(signUpRequest.getUsername(), signUpRequest.getPassword(), signUpRequest.getEmail()));

        Set<String> strFuncoes = signUpRequest.getFuncao();
        Set<Funcao> funcoes = new HashSet<>();

        if(strFuncoes == null){
            Funcao userFuncao = daoFuncao.findByName(EFuncao.CLIENTE)
                    .orElseThrow(() -> new RuntimeException("Erro: Funcao não encontrada."));
            funcoes.add(userFuncao);
        }else{
            strFuncoes.forEach(Funcao -> {
                switch(Funcao){
                    case "admin":
                        Funcao adminFuncao = daoFuncao.findByName(EFuncao.ADMIN)
                                .orElseThrow(()-> new RuntimeException("Erro: Funcao não encontrada."));
                        funcoes.add(adminFuncao);
                        break;
                    default:
                        Funcao userFuncao = daoFuncao.findByName(EFuncao.CLIENTE)
                                .orElseThrow(()-> new RuntimeException("Erro: Funcao não encontrada."));
                        funcoes.add(userFuncao);
                }
            });
        }
        user.setFuncoes(funcoes);
        daoUsuario.save(user);

        return ResponseEntity.ok(new MessageResponse("Usuario registrado com successo!"));
    }


}
