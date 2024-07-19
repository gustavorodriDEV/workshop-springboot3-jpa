package com.estudandojava.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudandojava.course.entities.Product;
import com.estudandojava.course.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}

	public Product findBaId(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
