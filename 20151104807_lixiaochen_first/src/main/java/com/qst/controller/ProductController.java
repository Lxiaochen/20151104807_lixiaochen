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
	 * ����ֵ��ʾ��ͼ����index����
	 */
	//�û����
	@RequestMapping(value = "/add")
	public String addProduct(Product product) {
		
		productService.addProduct(product);
		// ��ͼ������
		return "inventory/addInventory";
	}
	//��ҳ�б��ѯ
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

	//ͨ��id��ѯ�û���Ϣ
	@RequestMapping(value = "/query")
	public String queryById(Product product,HttpServletRequest request) {
		Product product2 = productService.findProductById(product.getProductId());
		request.setAttribute("u", product2);
		return "inventory/updateInventory";
	}
	
	//�����û���Ϣ
	@RequestMapping(value = "/update")
	public String updateProduct(Product product,HttpServletRequest request) {
		productService.updateProduct(product);
		return listProduct(product, request);
	}
	
	//ͨ��idɾ���û���Ϣ
	@RequestMapping(value = "/delete")
	public String deleteProduct(Product product,HttpServletRequest request) {
		productService.deleteProduct(product.getProductId());
		return listProduct(product, request);
	}
	
	
}
