package com.masai;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueObjectEx {

	public static void main(String[] args) {
		Queue<Student> q = new PriorityQueue<>(new StudentMarksComparator());

		q.add(new Student("Sumit", 550, 1));
		q.add(new Student("Shivam", 650, 2));
		q.add(new Student("Vivek", 750, 3));
		q.add(new Student("Anurag", 850, 4));
		q.add(new Student("Aman", 500, 5));
		q.add(new Student("Zola", 550, 6));
		q.add(new Student("Rogers", 750, 7));

		System.out.println(q);

		// System.out.println(q.peek());

		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}