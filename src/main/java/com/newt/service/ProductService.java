package com.newt.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newt.dao.ProductDao;
import com.newt.entity.Product;
@Service
public class ProductService {
	@Autowired
	ProductDao employeeDao;
	
	@Transactional
	public List<Product> getAllProducts() {
		return employeeDao.getAllProducts();
	}

	@Transactional
	public Product getProduct(int id) {
		return employeeDao.getProduct(id);
	}

	@Transactional
	public Product addProduct(Product product) {
		return employeeDao.addProduct(product);
	}

	@Transactional
	public Product updateProduct(Product product) {
		return employeeDao.updateProduct(product);

	}

	@Transactional
	public void deleteProduct(int id) {
		employeeDao.deleteProduct(id);
	}

}
