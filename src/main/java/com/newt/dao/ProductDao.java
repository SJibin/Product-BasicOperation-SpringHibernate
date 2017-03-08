package com.newt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.newt.entity.Product;

@Repository
public class ProductDao {
	@Autowired
	private SessionFactory sessionFactory;

	private void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public Product addProduct(Product product) {
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Saving Product object " + product);
		session.save(product);
		return product;
	}

	public Product getProduct(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Product product = (Product) session.get(Product.class, new Integer(id));
		return product;
	}

	public List<Product> getAllProducts() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> productList = session.createQuery("from Product").list();
		return productList;
	}

	public Product updateProduct(Product product) {
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("update Product object " + product);
		session.update(product);
		return product;

	}

	public void deleteProduct(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Product e = (Product) session.load(Product.class, new Integer(id));
		if (null != e) {
			session.delete(e);
		}

	}
}
