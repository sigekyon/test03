package test.app16;

public class Sample2 {
	static class SampleIterator implements java.util.Iterator<String> {
		private java.util.Iterator<String> it;
		public SampleIterator() {
			java.util.ArrayList<String> list = new java.util.ArrayList<String>();
			list.add("第1回");
			list.add("第2回");
			list.add("第3回");
			list.add("第4回");
			list.add("第5回");
			it = list.iterator();
		}
		public boolean hasNext() {
			return it.hasNext();
		}
		public String next() {
			return it.next();
		}
		public void remove() {
			
		}
	}
	static class SampleIterable implements Iterable<String> {
		public java.util.Iterator<String> iterator() {
			return new SampleIterator();
		}
	}
  
	public static void main(String[] args) {
		SampleIterable iterable = new SampleIterable();
		for (String element : iterable) {
			System.out.println(element);
		}
	}
}
