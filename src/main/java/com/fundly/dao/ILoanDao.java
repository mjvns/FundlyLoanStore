package com.fundly.dao;

import java.sql.SQLException;

import com.fundly.dto.Loan;

public interface ILoanDao {
	boolean save(Loan loan);
	double getremainingAmount(String lenderid, Double interest, String customerid);
}
