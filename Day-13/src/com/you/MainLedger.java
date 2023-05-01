package com.you;

import java.time.*;
import java.util.*;

public class MainLedger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entry expenseOne = new Entry("Grocery", 4000, LocalDate.parse("2022-12-01"), 'E');
		Entry expenseTwo = new Entry("Clothing", 4500, LocalDate.parse("2022-12-04"), 'E');
		Entry expenseThree = new Entry("Installment", 4000, LocalDate.parse("2022-12-10"), 'E');
		Entry expenseFour = new Entry("Education", 6500, LocalDate.parse("2022-12-12"), 'E');
		Entry expenseFive = new Entry("Fuel", 2000, LocalDate.parse("2022-12-13"), 'E');
		Entry expenseSix = new Entry("Bills", 8000, LocalDate.parse("2022-12-15"), 'E');
		Entry expenseSeven = new Entry("serventSalary", 7500, LocalDate.parse("2022-12-20"), 'E');
		Entry expenseEight = new Entry("Recharges", 1000, LocalDate.parse("2022-12-22"), 'E');
		Entry expenseNine = new Entry("Furniture", 8000, LocalDate.parse("2022-12-25"), 'E');
		Entry expenseTen = new Entry("Repairing", 2000, LocalDate.parse("2022-12-27"), 'E');

		// Create object of Ledger
		Ledger ledger = new Ledger();
		// add all expenses Entries
		ledger.addExpense(expenseOne);
		ledger.addExpense(expenseTwo);
		ledger.addExpense(expenseThree);
		ledger.addExpense(expenseFour);
		ledger.addExpense(expenseFive);
		ledger.addExpense(expenseSix);
		ledger.addExpense(expenseSeven);
		ledger.addExpense(expenseEight);
		ledger.addExpense(expenseNine);
		ledger.addExpense(expenseTen);

		// Entries of income
		Entry incomeOne = new Entry("Salary", 52000, LocalDate.parse("2022-12-01"), 'I');
		Entry incomeTwo = new Entry("Rent", 7000, LocalDate.parse("2022-12-05"), 'I');
		Entry incomeThree = new Entry("Interest", 2000, LocalDate.parse("2022-12-25"), 'I');
		Entry incomeFour = new Entry("gift", 3000, LocalDate.parse("2022-12-27"), 'I');
		Entry incomeFive = new Entry("Bonus", 15000, LocalDate.parse("2022-12-30"), 'I');

		// add all income Entries
		ledger.addIncome(incomeOne);
		ledger.addIncome(incomeTwo);
		ledger.addIncome(incomeThree);
		ledger.addIncome(incomeFour);
		ledger.addIncome(incomeFive);

		double totalIncome = ledger.getTotalIncome();
		double totalExpense = ledger.getTotalExpenses();
		System.out.println("Total Income: " + totalIncome);
		System.out.println("Total Expenses: " + totalExpense);

		System.out.println();

		System.out.println(ledger.getRemarkOnFinHealth());

		System.out.println();

		System.out.println(ledger);

		System.out.println();

		List<Entry> list = ledger.getHighestLowestExpenseIncomeEntries();
		System.out.println("The Highest expense entry is " + list.get(0));
		System.out.println("The Lowest expense entry is " + list.get(1));
		System.out.println("The Highest income entry is " + list.get(2));
		System.out.println("The Lowest income entry is " + list.get(3));

		System.out.println();

		list = ledger.getIncomeByDateRange(LocalDate.parse("2022-12-01"), LocalDate.parse("2022-12-15"));
		for (Entry entry : list) {
			System.out.println(entry.getDate() + "\t\t" + entry.getAmount() + "\t\t"
					+ entry.getParticular());
		}

		ledger.deleteExpensesExcludingAmountRange(4500, 7500);
		System.out.println("The updated total expense is " + ledger.getTotalExpenses());
	}

}

//
//Output
//Total Income: 79000.0
//Total Expenses: 47500.0
//
//Your financial health is good
//
//2022-12-01    -4000.0    Grocery
//2022-12-01    52000.0    Salary
//2022-12-04    -4500.0    Clothing
//2022-12-05    7000.0    Rent
//2022-12-10    -4000.0    Installment
//2022-12-12    -6500.0    Education
//2022-12-13    -2000.0    Fuel
//2022-12-15    -8000.0    Bills
//2022-12-20    -7500.0    serventSalary
//2022-12-22    -1000.0    Recharges
//2022-12-25    -8000.0    Furniture
//2022-12-25    2000.0    Interest
//2022-12-27    -2000.0    Repairing
//2022-12-27    3000.0    gift
//2022-12-30    15000.0    Bonus
//Grand Total    31500.0
//
//The Highest expense entry is 2022-12-15    -8000.0    Bills
//The Lowest expense entry is 2022-12-22    -1000.0    Recharges
//The Highest income entry is 2022-12-01    52000.0    Salary
//The Lowest income entry is 2022-12-25    2000.0    Interest

//The updated total expense is 18500.0
