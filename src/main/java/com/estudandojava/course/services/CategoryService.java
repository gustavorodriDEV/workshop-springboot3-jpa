package com.estudandojava.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudandojava.course.entities.Category;
import com.estudandojava.course.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}

	public Category findBaId(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
