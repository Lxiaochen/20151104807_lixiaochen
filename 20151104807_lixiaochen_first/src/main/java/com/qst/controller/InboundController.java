package com.qst.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qst.pojos.Inbound;
import com.qst.service.InboundService;

@RequestMapping(value = "/inbound")
@Controller
public class InboundController {

	@Resource
	private InboundService inboundService;
	@RequestMapping(value = "/add")
	public String addInbound(Inbound inbound,HttpServletRequest request){
		inboundService.addInbound(inbound);
		return listInbound(request);
	}
	
	@RequestMapping(value = "/select")
	public String listInbound(HttpServletRequest request){
		List<Inbound> list=inboundService.listInbound();
		request.setAttribute("list", list);
		return "inbound/listInbound";
	}
	@RequestMapping(value = "/delete")
	public String deleteInbound(int id,HttpServletRequest request){
		inboundService.deleteInbound(id);
		return listInbound(request);
	}
}
