package com.qst.dao;

import java.util.List;

import com.qst.pojos.Product;

public interface ProductDao {
	public void addProduct(Product product);
	public List<Product> listAllProducts(Product product);
	public Product listProducts(String productName);
	public int getTotalPageNum();
	public int getTotalPageNum2();
	public Product findProductById(int productId);
	public void updateProduct(Product user);
	public void updateProduct2(int warningNum,int productId);
	public void updateProduct3(int productId);
	public void deleteProduct(int productId);
	public Product findWarningById(int productId);
}
