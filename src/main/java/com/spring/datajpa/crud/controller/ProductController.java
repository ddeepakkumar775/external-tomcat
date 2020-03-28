package com.spring.datajpa.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.datajpa.crud.model.Product;
import com.spring.datajpa.crud.repository.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductRepository productRepository;

	@GetMapping("{id}")
	public Product getProduct(@PathVariable int id) {
		return productRepository.findById(id).get();
	}

	@PostMapping
	public Product saveProduct(@RequestBody Product product) {
		Product p = productRepository.save(product);
		return p;
	}

	@DeleteMapping("{id}")
	public String deleteProduct(@PathVariable int id) {
		productRepository.deleteById(id);
		return "item deleted";
	}

}
