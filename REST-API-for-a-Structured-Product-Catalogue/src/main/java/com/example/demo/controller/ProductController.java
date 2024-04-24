package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Availability;
import com.example.demo.entity.Product;
import com.example.demo.entity.Rating;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService service;

	@PostMapping("/addProduct")
	public String addProduct (@RequestBody  Product product) {
		service.addProduct(product);
		return "product added done " ;
		
	}


	@GetMapping("retrievProduct")
	public List retrievProduct() {
		List retrievProduct = service.retrievProduct();
		return retrievProduct;

	}
	@PatchMapping("updatePrice/{id}/{price}")
	public String updatePrice(@PathVariable int id,  @PathVariable  double price) {
		
		service.updatePrice(id, price);
		return "update sucsessfull" ;
		
	}
	
	@PatchMapping("updateAvailability/{id}/{inStock}/{quantity}")
	public String updateAvailability( @PathVariable  int id,  @PathVariable boolean inStock, @PathVariable int quantity) {
		
		Availability availability = new Availability(inStock, quantity);
		service.updateAvailability(id, availability);
		return "update done" ;
		
		
	}
	
	@PatchMapping("updateRatings/{id}")
	public String updateRatings( @PathVariable    int id,  @RequestBody  List<Rating> ratings) {
		service.updateRatings(id, ratings);
		return "update done ";
		
		
	}
	
	@PatchMapping("updatecategories/{id}/{categories}")
	public String updatecategories(@PathVariable   int id, @PathVariable  String categories) {
		
		service.updatecategories(id, categories);
		
		return "update done " ; 
	}
	
	@DeleteMapping("deleteProduct/{id}")
	public String deleteProduct( @PathVariable int id) {
		service.deleteProduct(id);
		return "delete done " ;
		
	}

}
