package com.qst.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qst.dao.ProductDao;
import com.qst.pojos.Product;
import com.qst.service.ProductService;

@Service
public class ProductServiceImp implements ProductService {

	@Resource
	private ProductDao productDao;
	
	
	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	public void addProduct(Product product) {
		productDao.addProduct(product);
	}

	public List<Product> listAllProducts(Product product) {
		// TODO Auto-generated method stub
		return productDao.listAllProducts(product);
	}

	public Product listProducts(String productName) {
		// TODO Auto-generated method stub
		return productDao.listProducts(productName);
	}

	public int getTotalPageNum() {
		// TODO Auto-generated method stub
		return productDao.getTotalPageNum();
	}

	public Product findProductById(int productId) {
		// TODO Auto-generated method stub
		return productDao.findProductById(productId);
	}

	public void updateProduct(Product user) {
		// TODO Auto-generated method stub
		productDao.updateProduct(user);
	}

	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		productDao.deleteProduct(productId);
	}

	public void updateProduct2(int warningNum,int productId) {
		// TODO Auto-generated method stub
		productDao.updateProduct2(warningNum,productId);
	}

	public int getTotalPageNum2() {
		// TODO Auto-generated method stub
		return productDao.getTotalPageNum2();
	}

	public void updateProduct3(int productId) {
		// TODO Auto-generated method stub
		productDao.updateProduct3(productId);
	}

	public Product findWarningById(int productId) {
		return productDao.findWarningById(productId);
	}

}
