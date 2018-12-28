package com.qst.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qst.pojos.Type;
import com.qst.service.TypeService;

@RequestMapping(value = "/type")
@Controller
public class TypeController {
	@Resource
	private TypeService typeService;
	@RequestMapping(value = "/add")
	public String addType(Type type,HttpServletRequest request){
		typeService.addType(type);
		return listType(request);
	}
	
	@RequestMapping(value = "/select")
	public String listType(HttpServletRequest request){
		List<Type> list=typeService.listType();
		request.setAttribute("list", list);
		return "type/listType";
	}
	@RequestMapping(value = "/delete")
	public String deleteType(int id,HttpServletRequest request){
		typeService.deleteType(id);
		return listType(request);
	}
}
