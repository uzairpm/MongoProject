package com.uzair.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uzair.entity.Order;
import com.uzair.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public Order saveOrder(Order o) {
		return repository.save(o);
	}
	
	public List<Order> viewAll() {
		return repository.findAll();
	}
}
