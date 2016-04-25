package com.sanjeev.model;

import java.io.Serializable;

public class Product implements Serializable{
	
	public Product() {
	
	}
	
	public Product(String name, String id, float price){
		this.name = name;
		this.id = id;
		this.price = price;
	}

	private static final long serialVersionUID = 1L;
	private String name;
	private String id;
	private float price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
