package com.creational.without.factory;

public class Loan {
	
	public final double calculateInterest(int loanAmount, String loanType) {
		double intrestRate = 0;
	
		if (loanType.equalsIgnoreCase("CarLoan")) {
			System.out.println("car Loan");
			intrestRate = getInterestRateforCarLoan();
		}
//		if (loanType.equalsIgnoreCase("HomeLoan")) {
//			System.out.println("Home Loan");
//			intrestRate = getInterestRateforCarLoan();
//		}
//		if (loanType.equalsIgnoreCase("PersonalLoan")) {
//			System.out.println("Personal Loan");
//			intrestRate = getInterestRateforCarLoan();
//		}
//		
		return loanAmount * (intrestRate / 100);
	}

	public double getInterestRateforCarLoan() {
		return 8;

	}

	public double getInterestRateforPersonalLoan() {
		return 13;

	}

	public double getInterestRatefoHomeLoan() {
		return 7;

	}

}
