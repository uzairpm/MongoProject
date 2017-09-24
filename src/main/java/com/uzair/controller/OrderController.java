package com.uzair.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uzair.entity.Order;
import com.uzair.service.OrderService;

@RestController
@RequestMapping("api/")
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@RequestMapping(value="order", method=RequestMethod.POST)
	public Order saveOrder(@RequestBody Order order) {
		return service.saveOrder(order);
	}
	
	@RequestMapping(value="order", method=RequestMethod.GET)
	public List<Order> viewAllOrders() {
		return service.viewAll();
	}
}
