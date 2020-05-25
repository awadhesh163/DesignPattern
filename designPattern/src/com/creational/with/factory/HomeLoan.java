package com.creational.with.factory;

public class HomeLoan extends Loan {

    @Override
    double getInterestRate() {
    	System.out.println("Home Loan");
        return 8;
    }

}