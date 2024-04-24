package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDao;
import com.example.demo.entity.Availability;
import com.example.demo.entity.Product;
import com.example.demo.entity.Rating;

@Service
public class ProductService {

	@Autowired
	ProductDao dao;

	public void addProduct(Product product) {

		dao.addProduct(product);

	}

	public List retrievProduct() {

		List retrievProduct = dao.retrievProduct();
		return retrievProduct;
	}

	public void updatePrice(int id, double price) {

		dao.updatePrice(id, price);

	}

	public void updateAvailability(int id, Availability availability) {

		dao.updateAvailability(id, availability);

	}

	public void updateRatings(int id, List<Rating> ratings) {

		dao.updateRatings(id, ratings);

	}

	public void updatecategories(int id, String categories) {

		dao.updatecategories(id, categories);

	}

	public void deleteProduct(int id) {

		dao.deleteProduct(id);
	}

}
