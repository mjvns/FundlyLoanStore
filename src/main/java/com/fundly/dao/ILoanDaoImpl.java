package com.fundly.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.fundly.Utils.JDBCUtils;
import com.fundly.dto.Loan;

public class ILoanDaoImpl implements ILoanDao{

	@Override
	public boolean save(Loan loan){
		Boolean status = false;
		Connection connection = null;
		PreparedStatement preparedstatement = null;
		
		try {
			connection = JDBCUtils.getJDBCConnection();
			if(connection != null) {
				String insertstatement = "insert into loan_store(`CustomerId`,`LenderId`,`Amount`,`RemainingAmount`,`PaymentDate`,`InterestPerDay(%)`,`DueDate`,`Penalty/Day(%Day)`,`Cancel`) values(?,?,?,?,?,?,?,?,?)";
				preparedstatement = connection.prepareStatement(insertstatement);
				
				preparedstatement.setString(1, loan.getCustomerid());
				preparedstatement.setString(2, loan.getLenderid());
				preparedstatement.setDouble(3, loan.getAmount());
				preparedstatement.setDouble(4, loan.getRemainingamount());
				preparedstatement.setDate(5, loan.getPaymentdate());
				preparedstatement.setDouble(6, loan.getInterestperday());
				preparedstatement.setDate(7, loan.getDuedate());
				preparedstatement.setDouble(8, loan.getInterestperday());
				preparedstatement.setBoolean(9, loan.getCancel());
				
				int result = preparedstatement.executeUpdate();
				
				if(result == 1) {
					System.out.println("Record inserted successfully");
					status = true;
				}else {
					System.out.println("Record insertion failed");
					status = false;
				}
			}
		} catch (SQLException e) {
			status = false;
			System.out.println("Record insertion failed");
			e.printStackTrace();
		} finally {
			if(connection != null) {
				try {
					connection.close();
					if(preparedstatement != null) {
						preparedstatement.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return status;
	}

	@Override
	public double getremainingAmount(String lenderid, Double interest, String customerid) {
		// TODO Auto-generated method stub
		return 0;
	}

}
