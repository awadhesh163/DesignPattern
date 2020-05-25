package com.creational.with.factory;

public class LoanFactory {
	
	 public Loan getLoan(LoanType loanType) {

	        switch (loanType) {
	            case CAR:
	                return new CarLoan();
	            case HOME:
	                return new HomeLoan();

	                default:
	                    return null;
	        }
	    }


}
