package com.vcubelab_dailytest.collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<>();

		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);

		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q.element());
		System.out.println(q);

		System.out.println("______________________________");

		Queue<Integer> qq = new LinkedList<>();

		qq.offer(10);
		qq.offer(20);
		qq.offer(30);
		qq.offer(40);
		qq.offer(50);
		qq.offer(60);

		System.out.println(qq);
		System.out.println(qq.poll());
		System.out.println(q.peek());
		System.out.println(q);
	}

}
