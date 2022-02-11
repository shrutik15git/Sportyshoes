package com.simplilearn.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="purchase")
public class Purchase {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int puchaseid;
	private int id;
	private int userId;
	private String username;
	private String email;
	private String season;
	private String brand;
	private String category;
	private int price;
	private String color;
	private String purchasedate;
	
	public Purchase() {
		
	}
	
	public Purchase(int puchaseid, int id, int userId, String username, String email, String season, String brand,
			String category, int price, String color, String purchasedate) {
		super();
		this.puchaseid = puchaseid;
		this.id = id;
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.season = season;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.color = color;
		this.purchasedate = purchasedate;
	}

	public int getPuchaseid() {
		return puchaseid;
	}

	public void setPuchaseid(int puchaseid) {
		this.puchaseid = puchaseid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPurchasedate() {
		return purchasedate;
	}

	public void setPurchasedate(String purchasedate) {
		this.purchasedate = purchasedate;
	}
	
	
}	
