package com.qst.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qst.pojos.Finance;
import com.qst.service.FinanceService;

@RequestMapping(value = "/finance")
@Controller
public class FinanceController {

	@Resource
	private FinanceService financeService;
	@RequestMapping(value = "/add")
	public String addInbound(Finance finance,HttpServletRequest request){
		financeService.addFinance(finance);
		return listFinance(request);
	}
	
	@RequestMapping(value = "/select")
	public String listFinance(HttpServletRequest request){
		List<Finance> list=financeService.listFinance();
		request.setAttribute("list", list);
		return "finance/listFinance";
	}
	@RequestMapping(value = "/delete")
	public String deleteInbound(int id,HttpServletRequest request){
		financeService.deleteFinance(id);
		return listFinance(request);
	}
}
