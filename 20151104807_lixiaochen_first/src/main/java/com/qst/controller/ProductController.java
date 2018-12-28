package com.qst.controller;


import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qst.pojos.Product;
import com.qst.service.ProductService;


@RequestMapping(value = "/inventory")
@Controller
public class ProductController {
	@Resource
	private ProductService productService;

	
	public ProductService getProductService() {
		return productService;
	}
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	/**
	 * 返回值表示视图（“index”）
	 */
	//用户添加
	@RequestMapping(value = "/add")
	public String addProduct(Product product) {
		
		productService.addProduct(product);
		// 视图解析器
		return "inventory/addInventory";
	}
	//分页列表查询
	@RequestMapping(value = "/list")
	public String listProduct(Product product,HttpServletRequest request) {
		product.setPage(true);
		List<Product> list = productService.listAllProducts(product);
		int total = productService.getTotalPageNum();
		System.out.println(total);
		int totalPage = 0;
		if(total%2==0) {
			totalPage = total/2;
		}else {
			totalPage = total/2+1;
		}
		product.setList(list);
		product.setTotalPage(totalPage);
		request.setAttribute("page", product);
		return "inventory/listInventory";
	}

	//通过id查询用户信息
	@RequestMapping(value = "/query")
	public String queryById(Product product,HttpServletRequest request) {
		Product product2 = productService.findProductById(product.getProductId());
		request.setAttribute("u", product2);
		return "inventory/updateInventory";
	}
	
	//更新用户信息
	@RequestMapping(value = "/update")
	public String updateProduct(Product product,HttpServletRequest request) {
		productService.updateProduct(product);
		return listProduct(product, request);
	}
	
	//通过id删除用户信息
	@RequestMapping(value = "/delete")
	public String deleteProduct(Product product,HttpServletRequest request) {
		productService.deleteProduct(product.getProductId());
		return listProduct(product, request);
	}
	
	
}
