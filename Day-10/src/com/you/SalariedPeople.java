package com.you;

public class SalariedPeople implements Taxation{
	 private double annualIncome;

	    public SalariedPeople(double annualIncome) {
	        this.annualIncome = annualIncome;
	    }

	    @Override
	    public double calculateTax() {
	        double tax = 0.0;
	        if (annualIncome > 10000000) {
	            tax += (annualIncome - 10000000) * 0.3;
	            tax += 2500000; // 7,50,000/- fixed surcharge
	        }else  if (annualIncome > 5000000) {
	            tax += (Math.min(annualIncome, 10000000) - 5000000) * 0.2;
	        }else if (annualIncome > 250000) {
	            tax += (Math.min(annualIncome, 500000) - 250000) * 0.1;
	        }
	        return tax;
	    }
}
