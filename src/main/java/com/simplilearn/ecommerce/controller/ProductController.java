package com.simplilearn.ecommerce.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.ecommerce.model.Product;
import com.simplilearn.ecommerce.repository.ProductRepository;



@RestController
@RequestMapping("/api/v1/")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	//get all products
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		List<Product> products = (List<Product>) productRepository.findAll();
		return products;
	}
	@GetMapping("/{id}")
	public Optional<Product> getProduct(@PathVariable long id){
		return productRepository.findById(id);
	}
	
	@GetMapping("/season/{season}")
	public List<Product> getProductSesaon(@PathVariable String season){
		List<Product> products = (List<Product>) productRepository.findProductBySeason(season);
		return products;
	}
	
	@GetMapping("/brand/{brand}")
	public List<Product> getProductBrand(@PathVariable String brand){
		List<Product> products = (List<Product>) productRepository.findProductByBrand(brand);
		return products;
	}
	
	@GetMapping("color/{color}")
	public List<Product> getProductColor(@PathVariable String color){
		List<Product> products = (List<Product>) productRepository.findProductByColor(color);
		return products;
	}
	
	@GetMapping("/category/{category}")
	public List<Product> getProductCategory(@PathVariable String category){
		List<Product> products = (List<Product>) productRepository.findProductByCategory(category);
		return products;
	}
	@GetMapping("/price/{price}")
	public List<Product> getProductPrice(@PathVariable int price){
		List<Product> products = (List<Product>) productRepository.findProductByPrice(price);
		return products;
	}
	@PostMapping("/add")
	public Product AddProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	@PutMapping("product/update/{id}")
	public Product updateProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	@DeleteMapping("product/delete/{id}")
	public void deleteProduct(@PathVariable long id) {
		productRepository.deleteById(id);
	}
}
