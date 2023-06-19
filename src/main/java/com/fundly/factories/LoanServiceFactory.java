package com.fundly.factories;

import com.fundly.services.ILoanServiceImpl;

public class LoanServiceFactory {
	
	public static ILoanServiceImpl loanservice = null;
	private LoanServiceFactory(){};
	
	public static ILoanServiceImpl getLoanService(){
		if(loanservice == null) {
			loanservice = new ILoanServiceImpl();
		}
		
		return loanservice;
	}
}
