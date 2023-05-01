package com.masai;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();

		q.add(80);
		q.add(20);
		q.add(50);
		q.add(80);
		q.add(30);
		q.add(70);
		q.add(15);
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.poll());

		Integer i;
//		
		while (!q.isEmpty()) {
			i = q.poll();
			System.out.print(i + " ");
		}

		System.out.println(q);
	}

}
