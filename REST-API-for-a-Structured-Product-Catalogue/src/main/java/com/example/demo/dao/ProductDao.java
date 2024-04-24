package com.example.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Availability;
import com.example.demo.entity.Product;
import com.example.demo.entity.Rating;
import com.zaxxer.hikari.util.ClockSource.Factory;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Repository
public class ProductDao {

	@Autowired
	SessionFactory sessionFactory;

	public void addProduct(Product product) {
		Session openSession = sessionFactory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		openSession.save(product);
		beginTransaction.commit();
	}

	public List retrievProduct() {
		Session openSession = sessionFactory.openSession();
		Query createQuery = openSession.createQuery("from Product");
		List list = createQuery.list();
		return list;

	
    }

	public void updatePrice(int id, double price) {

		Session openSession = sessionFactory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		Product product = openSession.get(Product.class, id);
		product.setPrice(price);
		beginTransaction.commit();

	}

	public void updateAvailability(int id, Availability availability) {

		Session openSession = sessionFactory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		Product product = openSession.get(Product.class, id);
		product.setAvailability(availability);
		beginTransaction.commit();

	}

	public void updateRatings(int id, List<Rating> ratings) {

		Session openSession = sessionFactory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		Product product = openSession.get(Product.class, id);
		product.setRatings(ratings);
		beginTransaction.commit();

	}

	

	public void updatecategories(int id, String categories) {

		Session openSession = sessionFactory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		Product product = openSession.get(Product.class, id);
		product.setCategories(categories);
		beginTransaction.commit();

	}

	public void deleteProduct(int id) {
		Session openSession = sessionFactory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		Product product = openSession.get(Product.class, id);
		openSession.delete(product);
		beginTransaction.commit();

	}

}
