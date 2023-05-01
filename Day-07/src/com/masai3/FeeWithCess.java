package com.masai3;

public class FeeWithCess extends FeeExpenses{
    private double cess;

    FeeWithCess(double tuitionFee,double serviceTax, double cess ) {
        super(tuitionFee, serviceTax);
        this.cess = cess;
    }
    
    @Override
	   void getTotalFee() {
	       double total;
	       total = getTuitionFee() + ((getServiceTax() / 100) * getTuitionFee()) + ((cess / 100) * getTuitionFee());
	       System.out.println("Total fee is : "+total);
    }
}
