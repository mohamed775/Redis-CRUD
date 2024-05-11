package com.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.entity.Product;
import com.system.repository.ProductDAO;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private  ProductDAO dao;
	
	
	
	@PostMapping()
	public Product save(@RequestBody Product  product) {
		return dao.save(product);
	}
	
	@GetMapping
	public List<Product> getAllProducts(){
		return dao.findAll();
	}
	
	@GetMapping("/{id}")
	public Product findById(@PathVariable int id) {
		return dao.findroductById(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable int id) {
		return dao.deleteProduct(id);
	}

}
