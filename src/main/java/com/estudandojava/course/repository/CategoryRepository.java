package com.estudandojava.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandojava.course.entities.Category;

public interface  CategoryRepository extends JpaRepository<Category, Long> {

}
