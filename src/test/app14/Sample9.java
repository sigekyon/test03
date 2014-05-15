package test.app14;

public class Sample9 {
	public static void main(String[] args) {
		String s = "abc";
		s = s + ", " + 1;
		s = s + ", " + 2.0;
		Object o = new Object();
		s = s + ", " + o;
		o = new Object() {
			public String toString() {
				return "HelloObject";
			}
		};
		s = s + ", " + o;
		s = s + ", " + null;
		System.out.println(s);
	}
}
