package com.simplilearn.ecommerce.repository;




import org.springframework.data.repository.CrudRepository;

import com.simplilearn.ecommerce.model.Purchase;

public interface PurchaseRepository extends CrudRepository<Purchase,Integer>{
	
}
