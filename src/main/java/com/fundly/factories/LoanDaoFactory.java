package com.fundly.factories;

import com.fundly.dao.ILoanDaoImpl;

public class LoanDaoFactory {
	public static ILoanDaoImpl loandao = null;
	private LoanDaoFactory() {}
	
	public static ILoanDaoImpl getLoanDao() {
		if(loandao == null) {
			loandao = new ILoanDaoImpl();
		}
		
		return loandao;
	}
}
