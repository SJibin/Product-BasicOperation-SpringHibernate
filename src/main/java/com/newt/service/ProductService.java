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
	ProductDao productDao;
	
	
	public List<Product> getAllProducts(){
		return productDao.findAll();
	}

	public Product addProduct(Product product) {
		return productDao.save(product);
	}

}
