package com.creational.with.factory;

public class CarLoan extends Loan {

    @Override
    double getInterestRate() {
    	System.out.println("car Loan");
        return 9;
    }
    

}