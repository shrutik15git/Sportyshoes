package com.simplilearn.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String brand;
	private String season;
	private String category;
	private String color;
	private int price;
	
	
	public Product() {
		
	}
	public Product(long id, String brand, String season, String category, String color, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.season = season;
		this.category = category;
		this.color = color;
		this.price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
