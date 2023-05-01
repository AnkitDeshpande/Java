package com.masai3;

public class FeeExpenses {
	   private double tuitionFee;
	   private double serviceTax;
	   
	   
	   FeeExpenses(double tuitionFee, double serviceTax) {
	       this.tuitionFee = tuitionFee;
	       this.serviceTax = serviceTax;
	   }

	   void getTotalFee() {
	       double total;
	       total = tuitionFee + ((serviceTax / 100) * tuitionFee);
	       System.out.println("Total fee is : "+total);
	   }

	public double getTuitionFee() {
		return tuitionFee;
	}

	public void setTuitionFee(double tuitionFee) {
		this.tuitionFee = tuitionFee;
	}

	public double getServiceTax() {
		return serviceTax;
	}

	public void setServiceTax(double serviceTax) {
		this.serviceTax = serviceTax;
	}
	   
	   
}
