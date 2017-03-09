package com.newt.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.newt.entity.Product;

@Repository
public interface ProductDao extends CrudRepository<Product, Integer> {
	public List<Product> findAll();
	public <S extends Product> List<S> save(Iterable<S> product);
}
