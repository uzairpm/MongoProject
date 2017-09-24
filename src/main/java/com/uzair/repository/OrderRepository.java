package com.uzair.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.uzair.entity.Order;

public interface OrderRepository extends MongoRepository<Order, String>{

}
