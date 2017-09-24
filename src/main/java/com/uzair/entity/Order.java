package com.uzair.entity;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Order {
	@Id
    public String id;
	public List<Product> products;
	public int total;
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	@Override
    public String toString() {
        return String.format("Order[id=%s, total='%d']",id, total);
    }
}
