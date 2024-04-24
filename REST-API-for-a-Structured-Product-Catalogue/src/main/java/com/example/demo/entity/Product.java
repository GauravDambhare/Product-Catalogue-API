package com.example.demo.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;

@Entity
public class Product {
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;

	  @Column(nullable = false)
	  private String name;

	  private String description;

	  private Double price;

	  @Column(columnDefinition = "text")
	  private String categories;

	  @ElementCollection
	  @CollectionTable(name = "product_attributes", joinColumns = @JoinColumn(name = "product_id", nullable = false)) // Added nullable=false
	  @MapKeyColumn(name = "attribute_name")
	  @Column(name = "attribute_value")
	  private Map<String, String> attributes;

	  @Embedded
	  private Availability availability;

	  
	  @OneToMany(cascade = CascadeType.PERSIST)
	    @JoinColumn(name = "product_id")
	    private List<Rating> ratings;

	public Product() {
		super();
		
	}

	public Product(Long id, String name, String description, Double price, String categories,
			Map<String, String> attributes, Availability availability, List<Rating> ratings) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.categories = categories;
		this.attributes = attributes;
		this.availability = availability;
		this.ratings = ratings;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

	public Availability getAvailability() {
		return availability;
	}

	public void setAvailability(Availability availability) {
		this.availability = availability;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", categories=" + categories + ", attributes=" + attributes + ", availability=" + availability
				+ ", ratings=" + ratings + "]";
	}

	
	}
	

	  
	

