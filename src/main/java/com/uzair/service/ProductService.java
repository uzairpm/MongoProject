package com.uzair.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uzair.entity.Product;
import com.uzair.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> getAllProducts() {
		return repository.findAll();
	}
	
	public Product getProductByName(String name) {
		return repository.findByName(name);
	}
	
	public List<Product> getProductsByCategory(String category) {
		return repository.findByCategory(category);
	}
	
	public Product saveProduct(Product p) {
		return repository.save(p);
	}
	
	/*public Product updateProduct(String id, Product p) {
		return repository.save(p);
	}*/
	
	public void deleteProduct(String id) {
		repository.delete(id);
	}
}
