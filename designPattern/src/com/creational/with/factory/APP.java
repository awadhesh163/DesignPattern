package com.creational.with.factory;

public class APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// source code  Refrence : https://medium.com/@info.anikdey003/factory-method-design-pattern-277dd4bd3a11
		
		
		LoanFactory loanFactory = new LoanFactory();

        Loan homeLoan = loanFactory.getLoan(LoanType.HOME);
        System.out.println(homeLoan.calculateInterest(1000));

        Loan carLoan = loanFactory.getLoan(LoanType.CAR);
        System.out.println(carLoan.calculateInterest(1000));

	}

}
