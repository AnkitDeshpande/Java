package com.you;

import java.util.List;

public class FileOperationDemo {
	public static void main(String[] args) {
		ReadWriteCenter center = new ReadWriteCenter("A.txt",
				"Originally formed in 1600 purely to trade with the Mughal Empire, the Company needed to secure its commercial posts at Calcutta, Bombay and Madras. It purchased land from Indian rulers to build its settlements on, and recruited native armed forces to protect them. Eventually, these evolved into the Bengal, Bombay and Madras Armies.",
				"After successfully battling the French for trading supremacy, and simultaneously involving itself in local politics, the Company became India’s leading power following Robert Clive’s victory at Plassey in 1757. In the years that followed, it expanded its Indian domains.");

		center.writeToFile();
		center.appendToFile();
		List<Integer> analysis = center.getAnalysis();

		System.out.println("Number of digits: " + analysis.get(0));
		System.out.println("Number of letters: " + analysis.get(1));
		System.out.println("Number of special symbols: " + analysis.get(2));
	}
}
