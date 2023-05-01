package com.you;
import java.util.Comparator;

public class SortByAmount implements Comparator<Entry> {
	@Override
	public int compare(Entry o1, Entry o2) {
		double amount1 = o1.getAmount();
		double amount2 = o2.getAmount();
		if (amount1 < amount2) {
			return -1;
		} else if (amount1 > amount2) {
			return 1;
		} else {
			return 0;
		}
	}
}
