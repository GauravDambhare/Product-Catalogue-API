package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Rating {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	  private Long userId;

	  private Double rating;

	  private String comment;
	  
	  @ManyToOne
	    private Product product;

	public Rating() {
		super();
		
	}

	public Rating(Long userId, Double rating, String comment, Product product) {
		super();
		this.userId = userId;
		this.rating = rating;
		this.comment = comment;
		this.product = product;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Rating [userId=" + userId + ", rating=" + rating + ", comment=" + comment + ", product=" + product
				+ "]";
	}

	
	

	  
	 
	  
	}
