package com.uzair;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		System.out.println("GET localhost:8080/api/products");
		System.out.println("GET localhost:8080/api/v1/products/iPad");
		System.out.println("GET localhost:8080/api/v1/products/category/Mobile Phone");
		//mongod.exe --dbpath d:\mongodb\data --storageEngine=mmapv1
	}
}