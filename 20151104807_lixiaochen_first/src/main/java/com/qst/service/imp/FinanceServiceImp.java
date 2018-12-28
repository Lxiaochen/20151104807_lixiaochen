package com.qst.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qst.dao.FinanceDao;
import com.qst.pojos.Finance;
import com.qst.service.FinanceService;

@Service
public class FinanceServiceImp implements FinanceService{
	@Resource
	private FinanceDao financeDao;
	public List<Finance> listFinance() {
		// TODO Auto-generated method stub
		return financeDao.listFinance();
	}
	public int addFinance(Finance finance) {
		// TODO Auto-generated method stub
		return financeDao.addFinance(finance);
	}
	public void deleteFinance(int financeId) {
		// TODO Auto-generated method stub
		financeDao.deleteFinance(financeId);
	}
}
