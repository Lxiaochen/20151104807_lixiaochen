package com.qst.dao;

import java.util.List;

import com.qst.pojos.Finance;

public interface FinanceDao {
	public List<Finance> listFinance();
	public int addFinance(Finance finance);
	public void deleteFinance(int financeId);
}
