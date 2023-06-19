package com.fundly.dto;

import java.sql.Date;

public class Loan {
	Integer loanid;
	String customerid;
	String lenderid;
	Double amount;
	Double remainingamount;
	Date paymentdate;
	Double interestperday;
	Date duedate;
	Double penaltyperday;
	Boolean cancel;
	
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getLenderid() {
		return lenderid;
	}
	public void setLenderid(String lenderid) {
		this.lenderid = lenderid;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getRemainingamount() {
		return remainingamount;
	}
	public void setRemainingamount(Double remainingamount) {
		this.remainingamount = remainingamount;
	}
	public Date getPaymentdate() {
		return paymentdate;
	}
	public void setPaymentdate(Date paymentdate) {
		this.paymentdate = paymentdate;
	}
	public Double getInterestperday() {
		return interestperday;
	}
	public void setInterestperday(Double interestperday) {
		this.interestperday = interestperday;
	}
	public Date getDuedate() {
		return duedate;
	}
	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}
	public Double getPenaltyperday() {
		return penaltyperday;
	}
	public void setPenaltyperday(Double penaltyperday) {
		this.penaltyperday = penaltyperday;
	}
	public Boolean getCancel() {
		return cancel;
	}
	public void setCancel(Boolean cancel) {
		this.cancel = cancel;
	}
	public Integer getLoanid() {
		return loanid;
	}
}
