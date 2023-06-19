package com.fundly.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.fundly.controllers.ILoanController;
import com.fundly.dto.Loan;
import com.fundly.factories.LoanControllerFactory;

public class MainApp {

	public static void main(String[] args) {
		ILoanController loancontroller = LoanControllerFactory.getLoanController();
		
		System.out.println("Welcome to Fundly's Loan Management System");
		System.out.println("******************************************\n");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("Press 1. to process Loan");
			System.out.println("Press 2. to view Loan details");
			
			Integer input = null;
			
			try {
				input = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			switch(input) {
			case 1:
				System.out.println("CustomerId :: ");
				String customerid = null;
				try {
					customerid = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				System.out.println("LenderId :: ");
				String lenderid = null;
				try {
					lenderid = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				System.out.println("Amount :: ");
				Double amount = null;
				try {
					amount = Double.parseDouble(br.readLine());
				} catch (NumberFormatException | IOException e) {
					e.printStackTrace();
				}
				
				System.out.println("Paymentdate :: ");
				String userinputdate = null;
				try {
					userinputdate = br.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
				Date utildate = null;
				try {
					utildate = sdf.parse(userinputdate);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				Long ltime = utildate.getTime();
				java.sql.Date sqldatepayment = new java.sql.Date(ltime);
				
				System.out.println("Interestperday :: ");
				Double interestperday = null;
				try {
					interestperday = Double.parseDouble(br.readLine());
				} catch (NumberFormatException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				System.out.println("Duedate :: ");
				try {
					String userduedate = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				SimpleDateFormat sudf = new SimpleDateFormat("yyyy-mm-dd");
				try {
					Date utildatedue = sdf.parse(userinputdate);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				Long ltimedue = utildate.getTime();
				java.sql.Date sqldatedue = new java.sql.Date(ltimedue);
				
				System.out.println("Penaltyperday :: ");
				Double penaltyperday = null;
				try {
					penaltyperday = Double.parseDouble(br.readLine());
				} catch (NumberFormatException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				Loan loan = new Loan();
				loan.setCustomerid(customerid);
				loan.setLenderid(lenderid);
				loan.setAmount(amount);
				loan.setRemainingamount(amount);
				loan.setPaymentdate(sqldatepayment);
				loan.setInterestperday(interestperday);
				loan.setDuedate(sqldatedue);
				loan.setPenaltyperday(penaltyperday);
				loan.setCancel(false);
				
				loancontroller.save(loan);
				break;
				
			case 2:
				break;
				
			default:
				System.out.println("Enter valid input :: [1,2] \n\n");
			}
		}
	}
}