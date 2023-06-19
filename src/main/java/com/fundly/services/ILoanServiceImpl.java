package com.fundly.services;

import com.fundly.dao.ILoanDao;
import com.fundly.dto.Loan;
import com.fundly.factories.LoanDaoFactory;

public class ILoanServiceImpl implements ILoanService{
	
	public ILoanDao loandao = null;

	@Override
	public boolean save(Loan loan) {
		loandao = LoanDaoFactory.getLoanDao();
		return loandao.save(loan);
	}

	@Override
	public double getremainingAmount(String lenderid, Double interest, String customerid) {
		// TODO Auto-generated method stub
		return 0;
	}

}
