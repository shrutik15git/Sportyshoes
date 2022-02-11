package com.simplilearn.ecommerce.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.ecommerce.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long>{
	public List<Product> findProductBySeason(String season);
	public List<Product> findProductByBrand(String brand);
	public List<Product> findProductByCategory(String category);
	public List<Product> findProductByPrice(int price);
	public List<Product> findProductByColor(String color);
}
