package com.fundly.factories;

import com.fundly.controllers.ILoanControllerImpl;

public class LoanControllerFactory {
	
	public static ILoanControllerImpl loancontroller = null;
	private LoanControllerFactory(){}
	
	public static ILoanControllerImpl getLoanController() {
		if(loancontroller == null) {
			loancontroller = new ILoanControllerImpl();
		}
		
		return loancontroller;
	}
}
