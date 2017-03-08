package com.newt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.newt.entity.Product;
import com.newt.service.ProductService;
@Controller
public class ProductController {
	@Autowired
	ProductService productService;

	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	public String getAllProducts(Model model) {

		List<Product> productList = productService.getAllProducts();
		model.addAttribute("product", new Product());
		model.addAttribute("productList", productList);
		return "productList";
	}

	@RequestMapping(value = "/getProduct/{id}", method = RequestMethod.GET)
	public Product getProductById(@PathVariable int id) {
		return productService.getProduct(id);
	}

	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public Product addProduct(@ModelAttribute("product") Product product) {
		Product pro=null;
		System.out.println("Product details"+product);
		if (product.getProductId()== 0) {
			System.out.println("ID "+product.getProductId());
			pro=productService.addProduct(product);
		} else {
			pro=productService.updateProduct(product);
		}

		return pro;
	}

	@RequestMapping(value = "/updateProduct/{id}", method = RequestMethod.PUT)
	public Product updateProduct(@ModelAttribute("product") Product product) {
		/*model.addAttribute("product", this.productService.getProduct(id));
		model.addAttribute("listOfEmployees", this.productService.getAllProducts());*/
		return productService.updateProduct(product);
	}

	@RequestMapping(value = "/deleteEmployee/{id}", method = RequestMethod.GET)
	public void deleteProduct(@PathVariable("id") int id) {
		productService.deleteProduct(id);
		

	}

}
