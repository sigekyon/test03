package test.app15;

import java.util.ArrayDeque;
import java.util.Queue;

public class Sample4 {
	public static void main(String[] args) {
		Queue<Long> q = new ArrayDeque<Long>();
		q.offer(1L);
		q.offer(2L);
		q.offer(3L);
		q.offer(4L);
		q.offer(5L);
		q.offer(6L);
		System.out.println(q.poll());
		q.offer(7L);
		while (!q.isEmpty()) {
			System.out.print(q.poll()+",");
		}
		System.out.println("");
	}
}
