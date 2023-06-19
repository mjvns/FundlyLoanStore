package com.fundly.factories;

import com.fundly.dao.ILoanDaoImpl;

public class ILoanDaoFactory {
	public static ILoanDaoImpl loandao = null;
	private ILoanDaoFactory() {}
	
	public static ILoanDaoImpl getLoanDao() {
		if(loandao == null) {
			loandao = new ILoanDaoImpl();
		}
		
		return loandao;
	}
}
