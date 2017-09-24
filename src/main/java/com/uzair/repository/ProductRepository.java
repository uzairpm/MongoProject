package com.uzair.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.uzair.entity.Product;

public interface ProductRepository extends MongoRepository<Product, String>{
	public Product findByName(String name);
	public List<Product> findByCategory(String category);
}
