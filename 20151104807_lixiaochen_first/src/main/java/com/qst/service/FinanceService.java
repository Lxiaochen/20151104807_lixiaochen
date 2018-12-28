package com.qst.service;

import java.util.List;

import com.qst.pojos.Finance;

public interface FinanceService {
	public List<Finance> listFinance();
	public int addFinance(Finance finance);
	public void deleteFinance(int financeId);
}
