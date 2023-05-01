package com.you;

import java.util.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ledger {
	private List<Entry> expenses;
	private List<Entry> income;

	public Ledger() {
		expenses = new ArrayList<>();
		income = new ArrayList<>();
	}

	public void addExpense(Entry expenseEntry) {
		// TODO Auto-generated method stub
		expenses.add(expenseEntry);
	}

	public void addIncome(Entry incomeEntry) {
		// TODO Auto-generated method stub
		income.add(incomeEntry);
	}

	public double getTotalIncome() {
		// TODO Auto-generated method stub
		double total = 0.0;
		for (Entry entry : income) {
			total += entry.getAmount();
		}
		return total;
	}

	public double getTotalExpenses() {
		// TODO Auto-generated method stub
		double total = 0.0;
		for (Entry entry : expenses) {
			total += entry.getAmount();
		}
		return total;
	}

	public String getRemarkOnFinHealth() {
		// TODO Auto-generated method stub
		double totalIncome = getTotalIncome();
		double totalExpenses = getTotalExpenses();
		double ratio = totalExpenses / totalIncome;
		if (ratio <= 0.7) {
			return "Your financial health is good";
		} else if (ratio <= 1.0 && ratio > 0.0) {
			return "You need to increase savings";
		} else {
			return "You need to manage expenses well and also try to increase income";
		}
	}

	public List<Entry> getHighestLowestExpenseIncomeEntries() {
		// TODO Auto-generated method stub
		List<Entry> result = new ArrayList<>();
		Collections.sort(expenses, new SortByAmount());
		result.add(expenses.get(0));
		result.add(expenses.get(expenses.size() - 1));
		Collections.sort(income, new SortByAmount());
		result.add(income.get(income.size() - 1));
		result.add(income.get(0));
		return result;

	}

	public List<Entry> getIncomeByDateRange(LocalDate startDate, LocalDate endDate) {
		List<Entry> incomeList = new ArrayList<>();

		// iterate through all entries and filter by date range and income range
		for (Entry entry : income) {
			LocalDate entryDate = entry.getDate();
			double amount = entry.getAmount();
			if (entryDate.isAfter(startDate.minusDays(1))
					&& entryDate.isBefore(endDate.plusDays(1))) {
				incomeList.add(entry);
			}
		}
		return incomeList;
	}

	public void deleteExpensesExcludingAmountRange(int from, int to) {
		// TODO Auto-generated method stub
		List<Entry> filteredExpenses = new ArrayList<>();
		// Iterate over the expense list and remove the ones that don't fall in the
		// specified range
		for (Entry expense : expenses) {
			double amount = expense.getAmount();
			if (amount >= from && amount <= to) {
				filteredExpenses.add(expense);
			}
		}
		// Update the expenses list to only contain the ones within the specified range
		expenses = filteredExpenses;

	}

	@Override
	public String toString() {
		// collection = add incoome +expenses
		// sort collection
		// print collection
		List<Entry> allEntries = new ArrayList<>(income);
		allEntries.addAll(expenses);
		Collections.sort(allEntries, new SortByAmount());
		return allEntries.toString();
	}

}
