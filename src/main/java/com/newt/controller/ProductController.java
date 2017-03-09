package com.newt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.newt.entity.Product;
import com.newt.service.ProductService;
import com.wordnik.swagger.annotations.ApiResponses;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@ResponseBody
@Api(value="/products",description="Products Using Swagger")
public class ProductController {
	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	@ApiOperation(value="Getting All Products")
	public  List<Product> getAllProducts() {

		List<Product> productList = productService.getAllProducts();
		return productList;
	}
	@RequestMapping(value="addingProduct",method=RequestMethod.POST)
	@ApiOperation(value="Adding Product")
	public Product addProduct(@RequestBody Product product){
		return productService.addProduct(product);
		
	}
}
