package com.company.entity;

public class Product {
	
	private int productId;
	private String productName;
	private String productType;
	private int productPrice;

	public Product() {
		super();
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}
	
	public String getProductType() {
		return productType;
	}

	public void setProductType(String ptype) {
		this.productType = ptype;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {

		return "Product: " + productName + "<br/>" + "Product ID: " + productId + "<br/>" + "Product Price: " + productPrice + "<br/>";
	}
}
