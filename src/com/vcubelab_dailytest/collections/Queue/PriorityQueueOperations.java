package com.vcubelab_dailytest.collections.Queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueOperations {

	public static void main(String[] args) {

		Queue<Integer> qq = new PriorityQueue<>();
		System.out.println("using Min-Heap");

		qq.offer(10);
		qq.offer(40);
		qq.offer(50);
		qq.offer(30);
		qq.offer(60);
		qq.offer(10);
		qq.offer(20);

		System.out.println(qq);
		System.out.println("-_________________________________");
		System.out.println("using Max-Heap");
		Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		q.offer(10);
		q.offer(40);
		q.offer(50);
		q.offer(30);
		q.offer(60);
		q.offer(10);
		q.offer(20);

		System.out.println(q);

	}

}
