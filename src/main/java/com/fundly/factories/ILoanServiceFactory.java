package com.fundly.factories;

import com.fundly.services.ILoanServiceImpl;

public class ILoanServiceFactory {
	
	public static ILoanServiceImpl loanservice = null;
	private ILoanServiceFactory(){};
	
	public static ILoanServiceImpl getLoanService(){
		if(loanservice == null) {
			loanservice = new ILoanServiceImpl();
		}
		
		return loanservice;
	}
}
