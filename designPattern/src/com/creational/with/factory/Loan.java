package com.creational.with.factory;

public abstract class Loan {
	
	protected double interestRate;

    abstract double getInterestRate();

    public double calculateInterest(int loanAmount){
        return loanAmount * (getInterestRate() / 100);
    }


}
