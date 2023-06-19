package com.fundly.controllers;

import com.fundly.dto.Loan;

public interface ILoanController {
	boolean save(Loan loan);
	double getremainingAmount(String lenderid, Double interest, String customerid);
}
