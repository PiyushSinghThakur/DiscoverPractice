package com.cg.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@Column(name="product_id")
	private Integer productId;
	@Column(name="product_name")
	private String productName;
    @Column(name="product_cost")
	private int productCost;
	public Product() {
		super();
	}
	public Product(Integer productId, String productName, int productCost) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
	}
	public int getProductCost() {
		return productCost;
	}
	public Integer getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ "]";
	}
    
}
