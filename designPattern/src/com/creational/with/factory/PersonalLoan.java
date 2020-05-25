package com.creational.with.factory;

public class PersonalLoan extends Loan {

    @Override
    double getInterestRate() {
        return 10;
    }
    
}
