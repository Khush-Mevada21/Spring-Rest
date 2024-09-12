package com.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.ProductEntity;

@RestController
public class ProductController {

	@PostMapping("/products")
	public String addProduct(@RequestBody ProductEntity productEntity) {
		System.out.println(productEntity.getProductName());
		System.out.println(productEntity.getPrice());
		
		return "Success";
	}
}
