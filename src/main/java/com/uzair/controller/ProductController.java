package com.uzair.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uzair.entity.Product;
import com.uzair.service.ProductService;

@RestController
@RequestMapping("api/")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public String message() {
		return "Welcome to Shopping Express";
	}
	
	@RequestMapping(value="products", method=RequestMethod.GET)
	public List<Product> getAllProducts() {
		return service.getAllProducts();
	}
	
	@RequestMapping(value="products/{name}", method=RequestMethod.GET)
	public Product getProductByName(@PathVariable String name) {
		return service.getProductByName(name);
	}
	
	@RequestMapping(value="products/category/{category}", method=RequestMethod.GET)
	public List<Product> getProductsByCategory(@PathVariable String category) {
		return service.getProductsByCategory(category);
	}
	
	@RequestMapping(value="products", method=RequestMethod.POST)
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	
	/*@RequestMapping(method=RequestMethod.PUT, value="products/{id}")
	public Product updateProduct(@PathVariable String id, @RequestBody Product product) {
		return service.updateProduct(id, product);
	}*/
	
	@RequestMapping(method=RequestMethod.DELETE, value="products/{id}")
	public void deleteTopic(@PathVariable String id) {
		service.deleteProduct(id);
	}
}
