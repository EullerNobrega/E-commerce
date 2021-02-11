package com.productapi.ecommerce.security.payload.response;

import io.jsonwebtoken.Jwt;

import java.util.List;

public class JwtResponse {
    private String token;
    private String type= "Bearer";
    private Long id;
    private String username;
    private String email;
    private String nomeHospital;
    private List<String> funcoes;

    public JwtResponse(String accessToken, Long id, String username, String email,List<String> funcoes){
        this.token = accessToken;
        this.id = id;
        this.username= username;
        this.email=email;
        this.funcoes=funcoes;;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getFuncoes() {
        return funcoes;
    }

    public void setFuncoes(List<String> Funcoes) {
        this.funcoes = Funcoes;
    }

}
