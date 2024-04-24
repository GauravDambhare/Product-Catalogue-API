package com.example.demo.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Availability {

  private boolean inStock;

  private Integer quantity;

public Availability() {
	super();
	
}

public Availability(boolean inStock, Integer quantity) {
	super();
	this.inStock = inStock;
	this.quantity = quantity;
}

public boolean isInStock() {
	return inStock;
}

public void setInStock(boolean inStock) {
	this.inStock = inStock;
}

public Integer getQuantity() {
	return quantity;
}

public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}

@Override
public String toString() {
	return "Availability [inStock=" + inStock + ", quantity=" + quantity + "]";
}


  
}