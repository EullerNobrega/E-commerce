package com.productapi.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DaoGenerico<T> extends JpaRepository<T, Long>{

}
