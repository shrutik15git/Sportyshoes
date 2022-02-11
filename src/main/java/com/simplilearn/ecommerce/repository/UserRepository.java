package com.simplilearn.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.simplilearn.ecommerce.model.User;

public interface UserRepository extends CrudRepository<User,Long>{

}
