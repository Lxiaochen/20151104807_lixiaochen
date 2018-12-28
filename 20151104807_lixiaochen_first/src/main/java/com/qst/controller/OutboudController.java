package com.qst.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qst.pojos.Outboud;
import com.qst.service.OutboudService;

@RequestMapping(value = "/outboud")
@Controller
public class OutboudController {

	@Resource
	private OutboudService outboudService;
	@RequestMapping(value = "/add")
	public String addOutboud(Outboud outboud,HttpServletRequest request){
		outboudService.addOutboud(outboud);
		return listOutboud(request);
	}
	
	@RequestMapping(value = "/select")
	public String listOutboud(HttpServletRequest request){
		List<Outboud> list=outboudService.listOutbound();
		request.setAttribute("list", list);
		return "outboud/listOutboud";
	}
	@RequestMapping(value = "/delete")
	public String deleteOutboud(int id,HttpServletRequest request){
		outboudService.deleteOutboud(id);
		return listOutboud(request);
	}
}
