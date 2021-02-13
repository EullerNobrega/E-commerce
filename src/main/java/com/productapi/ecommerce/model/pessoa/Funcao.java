package com.productapi.ecommerce.model.pessoa;

import javax.persistence.*;

@Entity
public class Funcao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private EFuncao name;

    public Funcao(){

    }

    public Funcao(EFuncao name){
        this.name = name;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EFuncao getName() {
        return name;
    }

    public void setName(EFuncao name) {
        this.name = name;
    }
}
