package com.creational.without.factory;

public class APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Loan loan = new Loan();
		double result = loan.calculateInterest(1000, "CarLoan");
		System.out.println(result);

	}

}
