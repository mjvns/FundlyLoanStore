package com.fundly.factories;

import com.fundly.controllers.ILoanControllerImpl;

public class ILoanControllerFactory {
	
	public static ILoanControllerImpl loancontroller = null;
	private ILoanControllerFactory(){}
	
	public static ILoanControllerImpl getLoanController() {
		if(loancontroller == null) {
			loancontroller = new ILoanControllerImpl();
		}
		
		return loancontroller;
	}
}
