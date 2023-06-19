package com.fundly.services;

import com.fundly.dto.Loan;

public interface ILoanService {
	boolean save(Loan loan);
	double getremainingAmount(String lenderid, Double interest, String customerid);
}
