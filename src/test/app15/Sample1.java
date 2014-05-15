package test.app15;

public class Sample1 {
	static class Queue{
		final int SIZE = 5;
		private int[] values = new int[SIZE+1];
		private int head = 0;
		private int tail = 0;
		
		void enqueue(int data){
			if(data > 0 & tail < SIZE){
				values[tail] = data;
				System.out.println("enqueue the value " + data + " to Queue[" + tail + "]");
				tail++;
			}
			else{
				System.out.println("ERROR:The Data " + data + " is not add!!");
			}
		}
		
		void dequeue(){
			if(isEmpty()){
				System.out.println("ERROR:Data is not exist!!");
			}
			else{
				System.out.println("dequeue the value:" + values[head]);
				for(int c = 0; c < tail; c++){
					values[c] = values[c+1];
				}
				tail--;
			}
		}
		
		private boolean isEmpty(){
			return (tail == head);
		}
		
		void view(){
			for(int cnt = head; cnt < tail; cnt++){
				System.out.println("Queue" + cnt + ":" + values[cnt]);
			}
		}
	}
	
	public static void main(String[] args) {
		Queue q = new Queue();
		q.dequeue();
		q.enqueue(5);
		q.enqueue(2);
		q.dequeue();
		q.enqueue(6);
		q.enqueue(4);
		q.enqueue(3);
		q.enqueue(0);
		q.enqueue(1);
		q.dequeue();
		q.enqueue(7);
		q.enqueue(8);
		q.view();
	}

}
