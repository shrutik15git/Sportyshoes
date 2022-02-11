package com.simplilearn.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.simplilearn.ecommerce.model.Purchase;
import com.simplilearn.ecommerce.repository.PurchaseRepository;


@RestController
@RequestMapping("/api/v3/")
public class PurchaseController {
	@Autowired
	private PurchaseRepository purchaseRepository;
	
	@GetMapping("/all")
	public List<Purchase> getAllPurchasedProducts() {
		List<Purchase> purchasedProducts = (List<Purchase>)purchaseRepository.findAll();
		return purchasedProducts;
	}
	
	@PostMapping("/add")
	public Purchase AddUserProductPurchased(@RequestBody Purchase purchase) {
		return purchaseRepository.save(purchase);
	}
	
}
