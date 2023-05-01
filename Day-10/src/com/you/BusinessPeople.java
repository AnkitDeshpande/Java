package com.you;

public class BusinessPeople  implements Taxation{
	private double totalSale;
    private double totalPurchase;
    private double operatingExpenses;

    public BusinessPeople(double totalSale, double totalPurchase, double operatingExpenses) {
        this.totalSale = totalSale;
        this.totalPurchase = totalPurchase;
        this.operatingExpenses = operatingExpenses;
    }

    @Override
    public double calculateTax() {
    	double n = 0.0;
        double netProfit = totalSale - (totalPurchase + operatingExpenses);
        double tax = 0.0;
        if (netProfit > 50000000) {
            tax += (netProfit - 50000000) * 0.32;
            tax += 12500000; // 12,50,000/- fixed surcharge
        }else if (netProfit > 15000000) {
            tax += (Math.min(netProfit, 50000000) - 15000000) * 0.22;
        }else if (netProfit > 500000) {
            tax += (Math.min(netProfit, 15000000) - 500000) * 0.1;
        }
        return tax;
    }
}
