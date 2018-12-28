package com.qst.controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qst.pojos.Product;
import com.qst.service.ProductService;


@RequestMapping(value = "/warning")
@Controller
public class WarningController {
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


	//分页列表查询
	@RequestMapping(value = "/list")
	public String listProduct(Product product,HttpServletRequest request) {
		product.setPage(true);
		List<Product> list = productService.listAllProducts(product);
		int total = productService.getTotalPageNum2();
		System.out.println(total);
		int totalPage = 0;
		if(total%2==0) {
			totalPage = total/2;
		}else {
			totalPage = total/2+1;
		}
		List<Product> list2 = new ArrayList<Product>();
		for (Product l : list) {
			if(l.getWarningNum()!=0) {
				list2.add(l);
			}
		}
		product.setList(list2);
		product.setTotalPage(totalPage);
		request.setAttribute("page", product);
		return "warning/listWarning";
	}


	//通过id删除用户信息
	@RequestMapping(value = "/delete")
	public String deleteWarning(Product product,HttpServletRequest request) {
		productService.updateProduct3(product.getProductId());
		return listProduct(product, request);
	}
	
	//添加预警信息
	@RequestMapping(value = "/add")
	public String addWarning(Product product,HttpServletRequest request) {
		productService.updateProduct2(product.getWarningNum(),product.getProductId());
		return "warning/addWarning";
	}
	
	@RequestMapping(value = "/update")
	public String updateWarning(Product product,HttpServletRequest request) {
		productService.updateProduct2(product.getWarningNum(),product.getProductId());
		return listProduct(product, request);
	}
	
	@RequestMapping(value = "/query")
	public String findWarning(Product product,HttpServletRequest request) {
		Product product2 = productService.findProductById(product.getProductId());
		request.setAttribute("w", product2);
		return "warning/updateWarning";
		
		
		
	}
	
	
	
}
