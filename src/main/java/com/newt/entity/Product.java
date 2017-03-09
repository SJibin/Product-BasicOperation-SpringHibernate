package com.newt.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "PRODUCT")
public class Product {
	@Id
	private int productId;
	private String itemName;
	private long totalInStock;
	private String description;
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private Date soldDate;
	public Product() {
		super();
	}
	public Product(int productId, String itemName, long totalInStock, String description, Date soldDate) {
		super();
		this.productId = productId;
		this.itemName = itemName;
		this.totalInStock = totalInStock;
		this.description = description;
		this.soldDate = soldDate;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public long getTotalInStock() {
		return totalInStock;
	}
	public void setTotalInStock(long totalInStock) {
		this.totalInStock = totalInStock;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getSoldDate() {
		return soldDate;
	}
	public void setSoldDate(Date soldDate) {
		this.soldDate = soldDate;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", itemName=" + itemName + ", totalInStock=" + totalInStock
				+ ", description=" + description + ", soldDate=" + soldDate + "]";
	}
}
