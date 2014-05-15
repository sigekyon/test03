package test.app15;

public class Sample2 {
	static class Queue<T> { //
		final int SIZE = 5;
		private Object[] values = new Object[SIZE+1];
		private int head = 0;
		private int tail = 0;
		boolean enqueue(T data) { //
			if (data == null) return false;
			if (((tail + 1) % values.length) == head) {
				return false;
			}
			values[tail++] = data;
			tail = tail % values.length;
			return true;
		}
		T dequeue() { //
			T data = null; //
			if (tail != head) {
				data = (T)values[head++]; //
				head = head % values.length;
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
			long data = q.dequeue(); //
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
