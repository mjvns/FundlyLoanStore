package com.fundly.controllers;

import com.fundly.dto.Loan;
import com.fundly.factories.LoanServiceFactory;
import com.fundly.services.ILoanService;

public class ILoanControllerImpl implements ILoanController{
	
	public ILoanService loanservice = null;

	@Override
	public boolean save(Loan loan) {
		loanservice = LoanServiceFactory.getLoanService();
		return loanservice.save(loan);
	}

	@Override
	public double getremainingAmount(String lenderid, Double interest, String customerid) {
		// TODO Auto-generated method stub
		return 0;
	}

}
