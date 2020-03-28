package com.spring.datajpa.crud.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.datajpa.crud.model.Product;

@Repository
@Transactional
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
