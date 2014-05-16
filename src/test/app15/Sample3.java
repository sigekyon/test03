package test.app15;

import java.util.ArrayList;

public class Sample3 {
	static class Queue<T> {
		final int SIZE = 5;
		private ArrayList<T> values = new ArrayList<T>();
		private int head = 0;
		private int tail = 0;
		Queue() {
			for (int i=0 ; i<SIZE+1 ; i++) {
				values.add(null);
			}
		}
		boolean enqueue(T data) {
			if (data == null) return false;
			if (((tail + 1) % values.size()) == head) {
				return false;
			}
			values.set(tail++, data);
			tail = tail % values.size();
			return true;
		}
		T dequeue() {
			T data = null;
			if (tail != head) {
				data = values.get(head++);
				head = head % values.size();
			}
			return data;
		}
		boolean isEmpty() {
			return (tail == head);
		}
	}

	public static void main(String[] args) {
		Queue<Long> q = new Queue<Long>(); 
		q.enqueue(1L);
		q.enqueue(2L);
		q.enqueue(3L);
		q.enqueue(4L);
		q.enqueue(5L);
		q.enqueue(6L);
		System.out.println(q.dequeue());
		q.enqueue(7L);
		while (!q.isEmpty()) {
			long data = q.dequeue();
			System.out.print(data+",");
		}
		System.out.println("");
		
		Queue<Integer> q2 = new Queue<Integer>();
		q2.enqueue(1);
		q2.enqueue(2);
		q2.enqueue(3);
		q2.enqueue(4);
		q2.enqueue(5);
		q2.enqueue(6);
		System.out.println(q2.dequeue());
		q2.enqueue(7);
		while (!q2.isEmpty()) {
			int data = q2.dequeue();
			System.out.print(data+",");
		}
		System.out.println("");
	}
}
