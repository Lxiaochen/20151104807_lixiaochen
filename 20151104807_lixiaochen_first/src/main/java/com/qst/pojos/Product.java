package com.qst.pojos;

import com.qst.base.BaseEntity;

public class Product extends BaseEntity<Product>{
	private int productId;
	private String productName;
	private float productPrice;
	private int productNum;
	private String remark;
	private int warningNum;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String productName, float productPrice, int productNum, String remark, int warningNum) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productNum = productNum;
		this.remark = remark;
		this.warningNum = warningNum;
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

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductNum() {
		return productNum;
	}

	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getWarningNum() {
		return warningNum;
	}

	public void setWarningNum(int warningNum) {
		this.warningNum = warningNum;
	}

	
	
	
}
